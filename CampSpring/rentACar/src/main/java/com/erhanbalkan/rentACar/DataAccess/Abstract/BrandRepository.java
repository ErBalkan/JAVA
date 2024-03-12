package com.erhanbalkan.rentACar.DataAccess.Abstract;

import com.erhanbalkan.rentACar.Entities.Concrete.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
