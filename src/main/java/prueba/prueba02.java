package prueba;

import domain.Cliente;
import mapping.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.jandex.Main;

import java.util.List;

public class prueba02 {
    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        String sql = "from Cliente c";//hql
        List<Cliente> lista = session.createQuery(sql).list();
        for (Cliente c : lista) {
            System.out.println("---------------------------------");
            System.out.println("ID: " + c.getId());
            System.out.println("NOMBRE: " + c.getNombre());
            System.out.println("APELLIDOS: " + c.getApellidos());
            System.out.println("TELEFONO: " + c.getTelefono());

        }
        session.close();
        factory.close();

    }



}
