package com.erhanbalkan.rentACar.WebApi.Controllers;

import com.erhanbalkan.rentACar.Business.Abstract.BrandService;
import com.erhanbalkan.rentACar.Entities.Concrete.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Annotation
@RequestMapping("api/brands")
public class BrandsController {
    private BrandService _brandService;

    @Autowired
    public  BrandsController(BrandService brandService){
        super();
        _brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return  _brandService.getAll();
    }
}
