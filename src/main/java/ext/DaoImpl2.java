package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daaa2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs");
        double temp=1000;
        return temp;
    }
}
