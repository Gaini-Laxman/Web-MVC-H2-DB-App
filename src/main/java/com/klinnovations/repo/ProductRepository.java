package com.klinnovations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
