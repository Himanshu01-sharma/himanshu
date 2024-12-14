package com.springcore.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
   Student student2 = (Student)context.getBean("student1");
   System.out.println(student2);
 Student jj =(Student) context.getBean("jocker");
 System.out.println(jj);
 Student mm=(Student)context.getBean("shikandar");
 System.out.println(mm);
 System.out.println("The world of the let barry queery meet domestic\n\n");

    }
}
