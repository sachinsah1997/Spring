package com.sachinsah.springcore;

import org.springframework.context.support.AbstractApplicationContext;
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
    	AbstractApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
        
    	Address address =  (Address) context.getBean("address");
    	Employee employee = (Employee) context.getBean("employeeData");
        Student student = (Student) context.getBean("student");
        
    	System.out.println(student);
    	System.out.println(address);
    	System.out.println(employee);
    	System.out.println(employee.getAddress());
    	
    	context.registerShutdownHook();
    }
}
