package application.main;

import application.model.Address;
import application.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){

        UserDetails userDetails = new UserDetails();
        userDetails.setUsername("aayush");

        Address address = new Address();
        address.setCity("kathmandu");
        address.setPincode("29418");
        address.setState("ktm state");
        address.setStreet("battishputali");
        Address address2 = new Address();
        address2.setCity("lalitpur");
        address2.setPincode("52248");
        address2.setState("ktm state");
        address2.setStreet("battishputali");


        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        userDetails.getListOfAddress().add(address);
        userDetails.getListOfAddress().add(address2);
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();
    }
}
