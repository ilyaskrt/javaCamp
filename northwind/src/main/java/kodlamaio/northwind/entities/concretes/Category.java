package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Table(name="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"}) //tekrara düşmemesi için kullanılıyor
public class Category {
	@Id
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category() {
		
	}
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	@OneToMany(mappedBy = "category")
	private List<Product> products;
}
