package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

//JPA alt yapısını kullanıcak
import lombok.Data;
//@Data ile get set kendiliğinden gelir
@Data
@Entity //sen bir veritabanı nesnesisin demek
@Table(name = "products") //hangi tabloya karşılık geldiğini söylüyoruz

public class Product {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id nin otomatik 1,1 arttırılıcağını belirledik 
	@Column(name = "product_id") //kolonları belirtiyoruz
	private int id;
	
	//@Column(name = "category_id")
	//private int categoryId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "units_in_stock")
	private short unitsInStock;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name="category_id")// hangi kolon ile ilişkilendirilicekse o
	private Category category; 

	public Product() {
		
	}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
	//	this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}

	public int getId() {
		return id;
	}
	
	public String getProductName() {
		return productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public short getUnitsInStock() {
		return unitsInStock;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	
}
