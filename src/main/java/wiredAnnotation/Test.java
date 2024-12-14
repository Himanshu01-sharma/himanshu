package wiredAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// error occur file path not found ;

public class Test {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("wiredAnnotation/life.xml");
employee emp1	=(employee) context.getBean("emp1");
System.out.println(emp1);

	}
}
