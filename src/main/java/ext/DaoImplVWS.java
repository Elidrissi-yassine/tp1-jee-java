package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daovws")
public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        return 100;
    }
}
