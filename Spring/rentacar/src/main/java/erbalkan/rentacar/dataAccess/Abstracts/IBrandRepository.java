package erbalkan.rentacar.dataAccess.Abstracts;

import java.util.List;

import erbalkan.rentacar.entities.concretes.Brand;

public interface IBrandRepository {
    List<Brand> getAll();

}
