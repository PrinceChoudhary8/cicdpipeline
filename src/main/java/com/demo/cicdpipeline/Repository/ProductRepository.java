package com.demo.cicdpipeline.Repository;

import com.demo.cicdpipeline.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<ProductEntity ,Long> {
}
