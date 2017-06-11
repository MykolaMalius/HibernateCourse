package models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="Product")
public class Product extends Model{
	
	@Size(min=4,max=16, message="Title must be between 4 and 16")
	@NotNull(message="Field cant be NULL")
	@Column(name="title")
	private String title;
	
//	@Pattern(regexp = "sadas%$") - For regulargs expresions-->if field dont equals to regular expression in @ --> it false
	//@NotEmpty ---> Checking for empty values 
	@NotNull(message="Field cant be NULL")
	@Column(name="description")
	private String description;
	
	@NotNull(message="Field cant be NULL")
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

	@Override
	public String toString() {
		return "Product [title=" + title + ", description=" + description + ", price=" + price + "]";
	}


}
