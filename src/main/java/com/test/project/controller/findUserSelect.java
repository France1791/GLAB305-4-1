import com.test.project.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public void findUserSelect(){
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    /* ------------  Example of HQL to get all the records------- */
    String hql = "SELECT u FROM User u";
    Query query = session.createQuery(hql);
    List<User> list  =  query.getResultList();

    for (User u : list) {
        System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());

    }
}

public void main() {
}




