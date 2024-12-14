package wiredAnnotation;

public class employee {
private Address address ;
public Address getAddress() {
	return address;
}

public employee(Address address) {
	super();
	this.address=address;
}
public employee() {
	super();
}

@Override
public String toString() {
	return "employee [address=" + address + "]";
}
}
