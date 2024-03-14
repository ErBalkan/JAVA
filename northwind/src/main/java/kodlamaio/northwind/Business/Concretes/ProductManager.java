package kodlamaio.northwind.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Business.Abstracts.ProductService;
import kodlamaio.northwind.DataAccess.Abstracts.ProductDao;
import kodlamaio.northwind.Entities.Concretes.Product;

public class ProductManager implements ProductService{

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao){
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }

}
