package erbalkan.rentacar.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import erbalkan.rentacar.entities.concretes.Brand;

public interface IBrandRepository extends JpaRepository<Brand,Integer>{
    // extends ederken Nesneyi ve id değerinin tipini verdik.
    // JPA bize otomatik olarak bütün crud işlemlerini verir. Ekstra concrete nesnesi oluşturmaya gerek yok.
}
