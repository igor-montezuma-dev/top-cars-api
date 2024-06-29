package com.igormontezumadev.topcars.service;

import com.igormontezumadev.topcars.dto.CarDTO;
import com.igormontezumadev.topcars.entity.Car;
import com.igormontezumadev.topcars.entity.Model;
import com.igormontezumadev.topcars.repositories.CarRepository;
import com.igormontezumadev.topcars.repositories.ModelRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;
    private final ModelRepository modelRepository;

    public CarService(CarRepository carRepository, ModelRepository modelRepository) {
        this.carRepository = carRepository;
        this.modelRepository = modelRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }


    public Car createCar(CarDTO carDTO) {
        Model model = getModel(carDTO.getModeloId());

        Car car = new Car();
        car.setModel(model);
        car.setNome_modelo(model.getNome());
        car.setCor(carDTO.getCor());
        car.setAno(carDTO.getAno());
            car.setValor(carDTO.getValor());
        car.setCombustivel(carDTO.getCombustivel());
        car.setNum_portas(carDTO.getNumPortas());
        car.setTimestamp_cadastro(Timestamp.from(Instant.now()));

        return carRepository.save(car);
    }
    public void delete(Long id) {
        carRepository.deleteById(id);
    }

    public Model getModel(Long modelId) {
        return modelRepository.findById(modelId).orElseThrow(() -> new RuntimeException("Model not found"));
    }
}