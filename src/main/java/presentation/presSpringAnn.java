package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnn {
    public static void main(String[] args){
        ApplicationContext con=new AnnotationConfigApplicationContext("ext","dao","metier");
        IMetier metier=con.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}
