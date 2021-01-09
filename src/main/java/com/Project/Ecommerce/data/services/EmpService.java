package com.Project.Ecommerce.data.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Project.Ecommerce.DTO.StatusResponse;
import com.Project.Ecommerce.data.Entity.Employee;
import com.Project.Ecommerce.data.Entity.Employee.Status;
import com.Project.Ecommerce.exceptions.ApplicationException;

import static com.Project.Ecommerce.data.Entity.Employee.Status.*;

@Service
public class EmpService {
	static Long counter = 0L;
	// Long empId=0L;
	static List<Employee> employees = new ArrayList<>();

	public Employee addEmployee(Employee emp) {
		emp.setId(counter++);
		emp.setStatus(ADDED);
		employees.add(emp);
		return emp;

	}

	public StatusResponse editeStatus(Employee emloyee) throws ApplicationException{
		Long empId = emloyee.getId();
		// if(employees.contains(emloyee))
		Employee employee = employees.stream()
				.filter(emp -> empId.equals(emp.getId()))
				.distinct()
				.findFirst().orElseThrow(()->new ApplicationException(new StatusResponse("400", "Employee not found")));
		if(employee==null)
			return new StatusResponse("400", "data_not_found");
		else{
		employees.remove(employees.indexOf(employee));
		employee.setStatus(emloyee.getStatus());
		employees.add(employee);
		return new StatusResponse("200", "status updated successfully");
		}
	}

}
