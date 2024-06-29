package com.igormontezumadev.topcars.service;

import com.igormontezumadev.topcars.dto.ModelDTO;
import com.igormontezumadev.topcars.entity.Brand;
import com.igormontezumadev.topcars.entity.Model;
import com.igormontezumadev.topcars.handlers.NotFoundException;
import com.igormontezumadev.topcars.handlers.ModelNotFoundException;
import com.igormontezumadev.topcars.repositories.BrandRepository;
import com.igormontezumadev.topcars.repositories.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Model createModel(ModelDTO modelDTO) {
        Brand brand = getBrand(modelDTO.getMarcaId());
        if (brand == null) throw new NotFoundException("Marca não encontrada");

        Model model = new Model();
        model.setBrand(brand);
        model.setNome(modelDTO.getNome());
        model.setValor_fipe(modelDTO.getValorFipe());

        return modelRepository.save(model);
    }

    public void delete(Long id) {
        modelRepository.deleteById(id);
    }

    public Brand getBrand(Long brandId) {
        return brandRepository.findById(brandId).orElseThrow(() -> new NotFoundException("Marca não encontrada"));
    }

    public Model getModel(Long modelId) {
        return modelRepository.findById(modelId).orElseThrow(() -> new ModelNotFoundException("Modelo não encontrado"));
    }
}
