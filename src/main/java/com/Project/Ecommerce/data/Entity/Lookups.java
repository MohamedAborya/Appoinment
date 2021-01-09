package com.Project.Ecommerce.data.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "sm_lookup")
@Where(clause = "IS_DISMANTLE <> 1")
public class Lookups {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECID")
	private Long id;

	@Column(name = "LOOKUP_TYPE")
	private String lookupType;

	@Column(name = "LOOKUP_VALUE")
	private String lookupValue;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "PARENT_LOOKUP")
	private Long parentId;

	@Column(name = "IS_DISMANTLE")
	private int isDismantle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLookupType() {
		return lookupType;
	}

	public void setLookupType(String lookupType) {
		this.lookupType = lookupType;
	}

	public String getLookupValue() {
		return lookupValue;
	}

	public void setLookupValue(String lookupValue) {
		this.lookupValue = lookupValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public int getIsDismantle() {
		return isDismantle;
	}

	public void setIsDismantle(int isDismantle) {
		this.isDismantle = isDismantle;
	}
}
