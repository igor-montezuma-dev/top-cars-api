package com.igormontezumadev.topcars.service;

import com.igormontezumadev.topcars.entity.Brand;
import com.igormontezumadev.topcars.entity.Model;
import com.igormontezumadev.topcars.repositories.BrandRepository;
import com.igormontezumadev.topcars.repositories.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelService {
    private final ModelRepository modelRepository;
    private final BrandRepository brandRepository;

    public ModelService(ModelRepository modelRepository, BrandRepository brandRepository) {
        this.modelRepository = modelRepository;
        this.brandRepository = brandRepository;
    }

    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    public Model save(Model model) {
        return modelRepository.save(model);
    }

    public void delete(Long id) {
        modelRepository.deleteById(id);
    }

    public Optional<Brand> findBrand(Long marcaId) {
        return brandRepository.findById(marcaId);
    }

    public  Model getModel(Long modelId) {
        return modelRepository.findById(modelId).orElseThrow(() -> new RuntimeException("Model not found"));
    }
}