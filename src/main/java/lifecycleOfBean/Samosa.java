package lifecycleOfBean;

public class Samosa {
private double price;
public double getprice() {
	System.out.println("setting price ");
	return price ;
}
 public void setprice(double price ) {
	this.price=price;
}
 public Samosa () {
	 super();
 }
 public String toSring() {
	 return "Samosa[ price=" +price+ "}";
	 
}
 public void hey() {
	 System.out.println("inside the init: you can change the ");
 }
 public void bye() {
	 System.out.println("now the destroy method get start");
	 
 }
 
}
