package com.igormontezumadev.topcars.repositories;

import com.igormontezumadev.topcars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
