package prueba;

import domain.Cliente;
import mapping.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class prueba03 {
    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        List<Cliente> lista = session.createCriteria(Cliente.class).list();
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
