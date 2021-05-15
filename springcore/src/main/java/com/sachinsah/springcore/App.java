package com.sachinsah.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sachinsah.springcollection.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student1");
        Employee employee = (Employee) context.getBean("employee");
    	System.out.println(student1);
    	System.out.println(employee);
    }
}
