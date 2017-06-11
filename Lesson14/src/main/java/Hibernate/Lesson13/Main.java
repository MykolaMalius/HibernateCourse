package Hibernate.Lesson13;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;

import models.Product;

public class Main {

	public static void main(String[] args) {
		
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		
		
		
	   Product product = new Product();
	   product.setTitle("as");
       Set<ConstraintViolation<Product>> constrs = validator.validate(product);
       
       for(ConstraintViolation<Product> constr: constrs){
    	   StringBuilder builder = new StringBuilder("property: ");
    	   builder.append(constr.getInvalidValue());
    	   builder.append("message: ");
    	   builder.append(constr.getPropertyPath());
    	   builder.append(" value: ");  
    	   builder.append(constr.getMessageTemplate());//Message for Wrong
    	   
    	   System.out.println(builder.toString());
    	   
    	 
       }
       
		
	}
}
