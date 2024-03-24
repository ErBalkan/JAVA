package erbalkan.rentacar.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import erbalkan.rentacar.business.Abstracts.IBrandService;
import erbalkan.rentacar.dataAccess.Abstracts.IBrandRepository;
import erbalkan.rentacar.entities.concretes.Brand;

@Service // Bu sınıf bir business nesnesidir.
public class BrandManager implements IBrandService{

    private IBrandRepository brandRepository;

    @Autowired // IoC
    public BrandManager(IBrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }

}
