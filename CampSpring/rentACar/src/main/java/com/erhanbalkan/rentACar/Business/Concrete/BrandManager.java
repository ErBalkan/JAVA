package com.erhanbalkan.rentACar.Business.Concrete;

import com.erhanbalkan.rentACar.Business.Abstract.BrandService;
import com.erhanbalkan.rentACar.DataAccess.Abstract.BrandRepository;
import com.erhanbalkan.rentACar.Entities.Concrete.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {

    private BrandRepository _brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository){
        super();
        _brandRepository = brandRepository;
    }
    @Override
    public List<Brand> getAll() {
        return _brandRepository.getAll();
    }
}
