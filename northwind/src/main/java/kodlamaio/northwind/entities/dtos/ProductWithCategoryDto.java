package kodlamaio.northwind.entities.dtos;


//Data Transfer Object

public class ProductWithCategoryDto {
	private int id;
	private String productName;
	private String categoryName;
	
	public ProductWithCategoryDto() {
		
	}
	public ProductWithCategoryDto(int id, String productName,String categoryName) {
		this.id=id;
		this.productName=productName;
		this.categoryName=categoryName;
	}
	public int getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}


