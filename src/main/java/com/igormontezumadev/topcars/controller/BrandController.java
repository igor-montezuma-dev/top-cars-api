package com.igormontezumadev.topcars.controller;

import com.igormontezumadev.topcars.entity.Brand;
import com.igormontezumadev.topcars.service.BrandService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {
    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping
    public ResponseEntity<List<Brand>> getAllBrands() {
        List<Brand> brands = brandService.findAll();
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Brand> createBrand(@RequestBody Brand brand) {
        Brand newBrand = brandService.save(brand);
        return new ResponseEntity<>(newBrand, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brand> getBrand(@PathVariable Long id) {
        try {
            Brand brand = brandService.getBrand(id);
            return new ResponseEntity<>(brand, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBrand(@PathVariable Long id) {
        brandService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}