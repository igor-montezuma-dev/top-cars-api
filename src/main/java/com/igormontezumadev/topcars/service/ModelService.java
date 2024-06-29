package com.igormontezumadev.topcars.service;

import com.igormontezumadev.topcars.entity.Model;
import com.igormontezumadev.topcars.repositories.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    private final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
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
}