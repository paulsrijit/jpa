package home.hibernatepractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import home.hibernatepractice.dto.Address;
import home.hibernatepractice.dto.FourWheeler;
import home.hibernatepractice.dto.TwoWheeler;
import home.hibernatepractice.dto.UserDetails;
import home.hibernatepractice.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		
		TwoWheeler vehicle = new TwoWheeler();
		vehicle.setVehicleName("New Honda");
		vehicle.setSteeringHandle("handle");
		
		FourWheeler vehicle2 = new FourWheeler();
		vehicle2.setVehicleName("Old Maruti");
		vehicle2.setSteeringWheel("wheel");
		
		Vehicle vehicle3 = new Vehicle();
		vehicle3.setVehicleName("Some Vehicle");

		UserDetails user = new UserDetails();
		user.setUserName("First Name");
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		user.getVehicle().add(vehicle3);
		

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.persist(user);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
