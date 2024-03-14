package kodlamaio.northwind.Business.Abstracts;

import java.util.List;

import kodlamaio.northwind.Entities.Concretes.Product;

public interface ProductService {
    List<Product> getAll();
}
