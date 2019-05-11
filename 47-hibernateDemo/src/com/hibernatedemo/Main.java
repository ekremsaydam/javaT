package com.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			//Unit of Work
			session.beginTransaction();
			
			//HQL-->Hibernate Query Language
			//Select * from City
			//List<City> cities = session.createQuery("from City c where c.countryCode='TUR' AND c.district='Ankara'").getResultList();
			//List<City> cities = session.createQuery("from City c where c.name LIKE 'kar%'").getResultList();
			//ASC-Ascending
			//DESC-Descending
			//List<City> cities = session.createQuery("from City c ORDER BY c.name DESC").getResultList();
			/*
			 * List<String> countryCodes =
			 * session.createQuery("select c.countryCode from City c GROUP BY c.countryCode"
			 * ).getResultList(); for(String countryCode:countryCodes) {
			 * System.out.println(countryCode); }
			 */
			
			//INSERT
			/*
			 * City city = new City(); city.setName("Düzce 11"); city.setCountryCode("TUR");
			 * city.setDistrict("Karadeniz"); city.setPopulation(100000);
			 * 
			 * 
			 * session.save(city); System.out.println("İlk işlem database yapıldı");
			 * session.save(new City());
			 */
			
			//UPDATE
			/*
			 * City city = session.get(City.class, 4086); city.setPopulation(110000);
			 * session.save(city); System.out.println(city.getName());
			 */
			
			//for(City city:cities) {
			//	System.out.println(city.getName());
			//}
			 
			 //CRUD - Create Read Update Delete
			
			//DELETE
			City city = session.get(City.class, 4086);
			session.delete(city);
			
			session.getTransaction().commit();
			System.out.println("Silindi");
		} catch(Exception e) {
			// hibernate session içindeki herhangi bir komut başarısız olursa otomatik roleback yapılır.
			System.out.println("İşlem geri alındı");
		} finally {
			factory.close();
		}
		
	}

}
