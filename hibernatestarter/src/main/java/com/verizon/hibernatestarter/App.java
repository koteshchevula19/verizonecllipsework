package com.verizon.hibernatestarter;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Laptop.class).buildSessionFactory();

		Session currentSession = sessionFactory.getCurrentSession();

		try {
			// Using the session to perform Operations here...
//			Laptop laptop = new Laptop("Waio", "Sony");
//			 1. begin the transaction
			currentSession.beginTransaction();

			// 2. run the transaction

//			currentSession.save(laptop);
			
//			Laptop readLaptop=currentSession.get(Laptop.class, 2);
//			
//			System.out.println(readLaptop);
			// roll backing
//			

			// 3. commit the transaction
//			currentSession.getTransaction().commit();
//			currentSession.getTransaction().rollback();
//			 currentSession.beginTransaction();

//           Retrieve all Laptops with all their details˳
//           List<Laptop> resultList = currentSession
//                   .createQuery(" from Laptop")
//                   .getResultList();
//           resultList
//                   .forEach(System.out::println);

//           List<Laptop> resultList = currentSession
//                   .createQuery("from Laptop l where l.manufacturer = 'Dell' OR l.name='Virtuso' ")
//                   .getResultList();
//           resultList.forEach(System.out::println);

//           List<Laptop> resultList = currentSession
//                   .createQuery("from Laptop l where l.name LIKE '%160'")
//                   .getResultList();
////
//           resultList.forEach(System.out::println);

//           Update Laptop
//           int laptopId = 2;
////
////           Laptop laptopToUpdate = currentSession.get(Laptop.class, laptopId);
//           Laptop laptopToDelete = currentSession.get(Laptop.class, laptopId);
////
//////           Delete the laptop
//           currentSession.delete(laptopToDelete);
//
//           System.out.println("Laptop details deleted...");

//           Update the laptop's name
//           laptopToUpdate.setName("Updated Name");

//           Or update through HQL:
//           currentSession.
//                   createQuery("update Laptop set ram=32")
//                           .executeUpdate();


//           Commit the transaction
           currentSession.getTransaction().commit();

//           System.out.println("All Laptops ram has been updated...");



//           Add a new Laptop and get the details back

//           1. Create a new Laptop object
//          

//           2. Begin the transaction
//           currentSession.beginTransaction();

//           3. Save the laptop
//           currentSession.save(laptop);

//           System.out.println("Laptop id : " + laptop.getId());

//           Laptop readLaptop = currentSession.get(Laptop.class, 2);
//
//           System.out.println("Laptop details : " + readLaptop);
//
////           4. Commit the transaction
//              currentSession.getTransaction().commit();

           //System.out.println("New Laptop details registered...");


			System.out.println("Laptop Registered Successfully");
		} finally {
			currentSession.close();

		}
	}
}
