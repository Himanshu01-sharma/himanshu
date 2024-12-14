package wiredAnnotation;

public class Address {

private String street;
private String city;
public String getstreet() {
	return street;
}
public String getcity() {
	return city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}
}
