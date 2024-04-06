package dao;
import org.springframework.stereotype.Component;

import java.lang.*;

@Component("daaa")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        /*
        * se connecter à la BD pour recuprérer la température
        * */
System.out.println("version BD");
        return Math.random()*40;
    }
}
