package constru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TEST {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("constru/cico.xml");
		person pp =(person) context.getBean("jj");
		System.out.println(pp);
	}

}
