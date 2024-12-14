package com.springcore.streotype;

import java.util.List;
import org.springframework.stereotype.*;

import org.springframework.beans.factory.annotation.Value;

@Component() 
public class emp {
@Override
	public String toString() {
		return "emp [empname=" + empname + ", city=" + city + ", address=" + address + "]";
	}
@Value("hs")
private String empname;

@Value("bombay")
private String city;
@Value("#{temp}")
private List<String>address;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}

}
