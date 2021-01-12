package com.devsuperior.dsdelivery.repositores;

import com.devsuperior.dsdelivery.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
