package com.sachinsah.springcore.sterotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sachinsah.springcollection.Employee;

/**
 * Hello world!
 *
 */
public class SteroApp 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context =  new ClassPathXmlApplicationContext("SteroConfig.xml");
        
    	Fruit fruit =  (Fruit) context.getBean("fruit");
        
    	System.out.println(fruit);
    	System.out.println(fruit.getTypes());
    	System.out.println(fruit.hashCode());
    	Fruit fruit2 =  (Fruit) context.getBean("fruit");
    	System.out.println(fruit2.hashCode());
    }
}
