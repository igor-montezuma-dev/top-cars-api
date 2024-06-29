package com.igormontezumadev.topcars.repositories;

import com.igormontezumadev.topcars.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
