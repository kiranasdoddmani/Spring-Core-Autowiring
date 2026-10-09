package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
//         CarByName carByName= (CarByName) context.getBean("carByName");
//          carByName.Drive();

        CarByType carByType= (CarByType) context.getBean("carbytype");
         carByType.Drive();
    }
}
