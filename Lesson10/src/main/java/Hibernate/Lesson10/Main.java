package Hibernate.Lesson10;

import org.hibernate.SessionFactory;

import models.Product;

public class Main {

	public static void main(String[] args) {
		
		Product apple = new Product();
		apple.setTitle("Apple");
		apple.setDescription("Red");
		apple.setPrice(12);
		
		
		Product orange = new Product();
		orange.setTitle("Orange");
		orange.setDescription("Orange fruit :)"); 
		orange.setPrice(30);
		
		
		Product banana = new Product();
		banana.setTitle("Banana");
		banana.setDescription("Yellow");
		banana.setPrice(25);
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
	}
}
