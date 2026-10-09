package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

//        PetrolEngine petrolEngine= (PetrolEngine) context.getBean("PetrolEngine");
//        petrolEngine.Start();
//
//        DesilEngine desilEngine= (DesilEngine)  context.getBean("DesilEngine");
//        desilEngine.Start();

          GannaCar gannaCar= (GannaCar) context.getBean("gannacar");
           gannaCar.Drive();
    }
}
