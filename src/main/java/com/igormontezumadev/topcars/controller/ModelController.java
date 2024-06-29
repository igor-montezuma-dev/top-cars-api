package com.igormontezumadev.topcars.controller;

import com.igormontezumadev.topcars.entity.Model;
import com.igormontezumadev.topcars.service.ModelService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/models")
public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public List<Model> getAllModels() {
        return modelService.findAll();
    }

    @PostMapping
    public Model createModel(@RequestBody Model model) {
        return modelService.save(model);
    }

    @DeleteMapping("/{id}")
    public void deleteModel(@PathVariable Long id) {
        modelService.delete(id);
    }
}