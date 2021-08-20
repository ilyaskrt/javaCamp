package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer>{
	//interface interface i extend eder
	//hangi tabloya hangi veri tipiyle sorgulanıcak belirtmiş oluyoruz
	
	Product getByProductName(String productName);  //bu bize 1 product getiricek
	
	//getBy gördüğü anda tabloda ilgili kolona göre ver koşulu getiriyor
	
	Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName,int categoryId);
	
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);//listede olanlardan getiriyor in bunun için var
	
	List<Product> getByProductNameContains(String productName); //buda isme göre arama
	
	//isimleri şununla başlayan veya biten
	List<Product> getByProductNameStartsWith(String productName);
	
	//sql sorgusunu arka planda yapıyor  Jpql
	//veritabanı tablosuna bakmıyoruz burda sorguda isim olarak 
	// : değeri gösterir nereden okuyacağını ifade eder
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName,int categoryId);
	
	
	//select p.productId,p.productName,c.categoryName
	//from Category c inner join Product p
	//on c.categoryId=p.categoryId
	//bunun jpql ini yazıcaz
	
	//atama yapıcağımız yerin package adını belirtiyoruz
	//kategoriyle kategoriden ilişkilendirilmiş productlardan çek diyor
	@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id,p.productName,c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
	
	
}