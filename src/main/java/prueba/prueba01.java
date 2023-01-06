package prueba;

import domain.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import mapping.HibernateUtil;

public class prueba01 {
    public static void main(String[] args) {

        SessionFactory factory = null;
        Session session = null;
        try {

            factory = HibernateUtil.getSessionFactory();
            session = factory.openSession();

            Cliente cliente = new Cliente(1,"Ramiro","Nuñez Perez","51942749295");

            Cliente cliente2 = new Cliente(2,"Emily","Benez","519668957825");
            Cliente cliente3= new Cliente(3,"Carolina","Garcia","5196614211");
            Cliente cliente4 = new Cliente(4,"Tatiana","Nuñez Garcia","51942749234");

            session.getTransaction().begin();
            session.save(cliente);

            session.save(cliente2);
            session.save(cliente3);
            session.save(cliente4);

            session.getTransaction().commit();
            //session.persist(cliente);
            System.out.println("Todo ok.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                session.close();
            } catch (Exception e) {
            }
            try {
                factory.close();
            } catch (Exception e) {
            }
        }
    }



}
