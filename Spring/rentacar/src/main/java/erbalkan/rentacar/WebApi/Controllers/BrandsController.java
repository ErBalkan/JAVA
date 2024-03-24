package erbalkan.rentacar.WebApi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import erbalkan.rentacar.business.Abstracts.IBrandService;
import erbalkan.rentacar.entities.concretes.Brand;

@RestController // Annotation
@RequestMapping("/api/brands")
public class BrandsController {
    private IBrandService brandService;

    @Autowired // IoC
    public BrandsController(IBrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    // www.erbalkan.com/api/brands/getall
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}
