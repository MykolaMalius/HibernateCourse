package Hibernate.Lesson11;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javassist.bytecode.Descriptor.Iterator;
import models.Product;

public class Main {

	public static void main(String[] args) {
		
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Object> products = null;
		
		try{
			session.beginTransaction();//start our Transaction
		SQLQuery querySelect = session.createSQLQuery("SELECT * FROM  fruits.product");
		querySelect.addEntity(Product.class);
		products = querySelect.list();
		
		
		
		session.getTransaction().commit();//the end of Transaction -> make a commit if true
		}
		catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();//rollback to start if code return false
			
		}
		finally{
			sessionFactory.close();
			
			
		}
		
		
		
		for(Object obj: products) {
			System.out.println(obj.toString());
		}
		session.close(); 
	}
}
