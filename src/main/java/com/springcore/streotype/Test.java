package com.springcore.streotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// date : 25-10-2024 Time : 11:17 Am
public class Test {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext ("com/springcore/streotype/updat.xml");
emp Emp=context.getBean("emp",emp.class);
System.out.println(Emp);
System.out.println(Emp.hashCode());
System.out.println("The hascode is are as follows .............");
System.out.println(Emp.hashCode());
System.out.println(Emp.getAddress().getClass().getName());
System.out.println("both hash code is same means  the object is same ");
	}

}
