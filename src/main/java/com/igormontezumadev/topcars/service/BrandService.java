package com.igormontezumadev.topcars.service;
import com.igormontezumadev.topcars.entity.Brand;
import com.igormontezumadev.topcars.repositories.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BrandService {
    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Brand save(Brand brand) {
        return brandRepository.save(brand);
    }

    public void delete(Long id) {
        brandRepository.deleteById(id);
    }
}