package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mett")
public class IMetierImpl implements IMetier {
    //couplage faible

    @Autowired
    @Qualifier("daaa2")
    private IDao dao;

    /*
    * public IMetierImpl(IDao dao) {
        this.dao = dao;
    }*/

    @Override
    public double calcule() {
        double temp=dao.getData();
        double res=temp*110/Math.cos(temp*Math.PI);
        return res;
    }
//Injecter dans la variable dao un objet d'une classe qui implements l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
