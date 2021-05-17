package com.sachinsah.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sachinsah.springorm.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
       
    	ApplicationContext context =  new  ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao  = (StudentDao) context.getBean("studentDao");
    	Student student = new Student(123, "Sachin Sah", "Surat");
    	studentDao.insert(student);
    }
}
