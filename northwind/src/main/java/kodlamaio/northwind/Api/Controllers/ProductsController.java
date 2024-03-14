package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Business.Abstracts.ProductService;
import kodlamaio.northwind.Entities.Concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService){
        this.productService = productService;
    }
    
    @GetMapping("/getall")
    public List<Product> getAll(){
        return productService.getAll();
    }

}
