package erbalkan.rentacar.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import erbalkan.rentacar.entities.concretes.Brand;

public interface IBrandRepository extends JpaRepository<Brand,Integer>{

}
