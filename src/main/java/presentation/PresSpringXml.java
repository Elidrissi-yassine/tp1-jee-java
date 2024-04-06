package presentation;


import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationCntext.xml");
        IMetier metie=(IMetier) context.getBean("mett");
    System.out.println(metie.calcule());
    }
}
