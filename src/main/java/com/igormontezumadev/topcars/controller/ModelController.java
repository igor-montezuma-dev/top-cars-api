package com.igormontezumadev.topcars.controller;

import com.igormontezumadev.topcars.dto.ModelDTO;
import com.igormontezumadev.topcars.entity.Brand;
import com.igormontezumadev.topcars.entity.Model;
import com.igormontezumadev.topcars.service.ModelService;
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
import java.util.Optional;

@RestController
@RequestMapping("/models")
public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public ResponseEntity<List<Model>> getAllModels() {
        List<Model> models = modelService.findAll();
        return new ResponseEntity<>(models, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Model> createModel(@RequestBody ModelDTO modelDTO) {
        Model newModel = modelService.createModel(modelDTO);
        return new ResponseEntity<>(newModel, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModel(@PathVariable Long id) {
        modelService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}