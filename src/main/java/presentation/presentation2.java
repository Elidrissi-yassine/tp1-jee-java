package presentation;

import dao.IDao;
import metier.IMetier;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.io.*;

public class presentation2 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("config.txt"));
        String daoclassename=sc.nextLine();
        Class cDao=Class.forName(daoclassename);
        IDao dao=(IDao)cDao.newInstance();
        System.out.println(dao.getData());
        String metierclassname=sc.nextLine();
        Class cmetier=Class.forName(metierclassname);
        IMetier metier= (IMetier)cmetier.newInstance();
        //on peut pas utiliser la methode set d'une facon static
        Method methode=cmetier.getMethod("setDao",IDao.class);
        methode.invoke(metier,dao);
        System.out.println(metier.calcule());
    }
}
