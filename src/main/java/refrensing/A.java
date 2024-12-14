package refrensing;

public class A {
private int x;
private b obj ;
public int getx() {
	System.out.println("The value of x = "+x);
	return x;
}
public void  setx(int x) {
	this.x= x;
}
public b getObj() {
	return obj;
}
@Override
public String toString() {
	return "A [x=" + x + ", obj=" + obj + "]";
}
public A() {
	super();
	// TODO Auto-generated constructor stub
}
public void setobj(b obj ) {
	this.obj=obj;
}
}
