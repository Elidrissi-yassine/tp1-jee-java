package presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args){
        //injection des dependances par instanciation static => new :( !!!! couplage fort )
        DaoImpl2 dao=new DaoImpl2();
        IMetierImpl metier=new IMetierImpl();
        metier.setDao(dao);
        System.out.println( "resultat "+metier.calcule());
    }
}
