package collections;
import java.util.*;
public class emp {
 private String name ;
private List<String>phone;
 private Set<String>Address;
 private Map<String,String>courses;






public emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "emp [name=" + name + ", phone=" + phone + ", Address=" + Address + ", courses=" + courses + ", Courses="
			+ Courses + "]";
}
public emp(String name, List<String> phone, Set<String> address, Map<String, String> courses) {
	super();
	this.name = name;
	this.phone = phone;
	Address = address;
	Courses = courses;
}
private Map<String,String>Courses;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhone() {
	return phone;
}
public void setPhone(List<String> phone) {
	this.phone = phone;
}
public Set<String> getAddress() {
	return Address;
}
public void setAddress(Set<String> address) {
	Address = address;
}
public Map<String, String> getCourses() {
	return Courses;
}
public void setCourses(Map<String, String> courses) {
	Courses = courses;
}
}
