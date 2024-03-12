package com.erhanbalkan.rentACar.Business.Abstract;

import com.erhanbalkan.rentACar.Entities.Concrete.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
