package collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("collections/collectionconfig.xml");
emp jobb= (emp)context.getBean("ccc");
System.out.println(jobb);


	}

	
	

}
