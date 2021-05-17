package com.sachinsah.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class SteroApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
        
    	Fruit fruit =  (Fruit) context.getBean("fruit");
        
    	System.out.println(fruit);
    	System.out.println(fruit.getTypes());
    	System.out.println(fruit.hashCode());
    	Fruit fruit2 =  (Fruit) context.getBean("fruit");
    	System.out.println(fruit2.hashCode());
    }
}
