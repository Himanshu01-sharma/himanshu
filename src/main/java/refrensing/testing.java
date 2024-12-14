package refrensing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("here we are in the fereseig type of spring ");
ApplicationContext context= new ClassPathXmlApplicationContext("refrensing/refrence.xml");
A temp=(A)context.getBean("a.ref");
System.out.println(temp);
System.out.println(temp.getObj() );
temp.setx(22);
System.out.println(temp.getx());
	}

}
