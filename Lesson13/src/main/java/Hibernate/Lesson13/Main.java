package Hibernate.Lesson13;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;

import models.Product;

public class Main {

	public static void main(String[] args) {
		
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		List<Product> products = null;
		
		
		try{
//			long [] fun = {1, 2, 3, 4};
			session.beginTransaction();//start our Transaction
		   Criteria criteria = session.createCriteria(Product.class);
//		   criteria.add(Restrictions.eq("title", "Banana"));// its like SELECT * FROM product WHERE title='Banana'
//		   criteria.add(Restrictions.eq("id", fun));//its like SELECT * FROM product WHERE id = 1,2,3,4
//		   criteria.add(Restrictions.between("price", 1.0, 100.0));//WHERE id between 1-100
//		   criteria.add(Restrictions.like("description", "Y%"));//where description like 'Y%'
//		   criteria.add(Restrictions.or(Restrictions.not(Restrictions.between("price", 25.0, 40.0))));
		  // criteria.add(Restrictions.sqlRestriction("price > 25"));
//		   criteria.addOrder(Order.desc("price"));//price from higher to bottom
//		   criteria.addOrder(Order.asc("price"));//price from down to higher
        
		   //How to make alias in criteria ----> its like SQL --> SELECT FROM product p:
//		   criteria.createCriteria("product.productCategory", "productCategory");
//		   criteria.add(Restrictions.eq("product.title", "Blood"));
//		   criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

		   products = criteria.list();
		   
		
		
		session.getTransaction().commit();//the end of Transaction -> make a commit if true
		}
		catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();//rollback to start if code return false
			
		}
		finally{
			session.close(); 
			
		}
		
		for(Product pr: products){
			System.out.println(pr);
		}
		
	}
}
