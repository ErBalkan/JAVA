package erbalkan.rentacar.business.Abstracts;

import java.util.List;

import erbalkan.rentacar.entities.concretes.Brand;

public interface IBrandService {
    List<Brand> getAll();
}
