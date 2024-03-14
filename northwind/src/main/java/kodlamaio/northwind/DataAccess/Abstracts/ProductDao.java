package kodlamaio.northwind.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
    
}
