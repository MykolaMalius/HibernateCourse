package models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product extends Model{
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private double price; 
	
	@ManyToOne
	@JoinColumn(name="product_category_id", referencedColumnName="id")
	private ProductCategory productCategory;
	
	public Product(){
		super();
	}
	
	public Product(Long id){
		super(id);
	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
}
