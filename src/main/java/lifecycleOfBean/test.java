package lifecycleOfBean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
public static void main(String[] args) {
AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifecycleOfBean/updat.xml");
	Samosa ss=(Samosa)context.getBean("jj");
	System.out.println(ss);
	context.registerShutdownHook();
}
}
