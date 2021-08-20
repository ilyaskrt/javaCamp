package kodlamaio.northwind.api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@RestController //sen controllersın demek 
@RequestMapping("/api/products") // adresinden bir istek gelirse bu controller karar vericek

public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	
	
	@GetMapping("/getall") //restcntroller ve burası istek geldiğinde burası çalışır
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	//yapılan isteğin parametrelerine bk prodName olucak ordan oku 
	//@reguestparam kullanma sebebibim
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	//swaggerdan dolayı hala aldık bu yüzden request paramda hangi alana maplemesi gerktiğini belirtiyoruz
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> 
	getByProductNameAndCategoryId(@RequestParam ("productName") String productName,@RequestParam ("categoryId")int categoryId){
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByProductNameOrCategoryId")
	public DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam String productName,@RequestParam int categoryId){
		return this.productService.getByProductNameOrCategoryId(productName, categoryId);	
	}
	
	@GetMapping("/getByProductsNameContains")
	public DataResult<List<Product>> getByProductsNameContains(@RequestParam String productName){
		return this.productService.getByProductsNameContains(productName);
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo, pageSize);	
	}
	
	@GetMapping("/getAllAsc")
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
	}
	
	@GetMapping("/getProductWithCategoryDetails") 
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	}
	
	
}
