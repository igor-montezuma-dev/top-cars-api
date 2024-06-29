package com.igormontezumadev.topcars.repositories;

import com.igormontezumadev.topcars.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
