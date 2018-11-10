import com.wadhone.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Sushant");

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.save(e);
        t.commit();
        session.close();


    }
}
