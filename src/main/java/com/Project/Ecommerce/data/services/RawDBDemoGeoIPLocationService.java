package com.Project.Ecommerce.data.services;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Ecommerce.data.Entity.GeoIp;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
@Service
public class RawDBDemoGeoIPLocationService {


private DatabaseReader dbReader;
    
    public RawDBDemoGeoIPLocationService() throws IOException {
        File database = new File("E://GeoLite2-City_20210105/GeoLite2-City.mmdb");
        dbReader = new DatabaseReader.Builder(database).build();
    }
    
    public GeoIp getLocation(String ip)  throws IOException, GeoIp2Exception {
        InetAddress ipAddress = InetAddress.getByName(ip);
        CityResponse response = dbReader.city(ipAddress);
        
        String cityName = response.getCity().getName();
        String latitude1 = 
          response.getLocation().getLatitude().toString();
        String longitude1 = 
          response.getLocation().getLongitude().toString();
        return new GeoIp(ip, cityName, latitude1, longitude1);
       
    }
    
    
    
    
    
    
    
    
}
