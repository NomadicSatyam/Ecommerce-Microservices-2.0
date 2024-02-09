package com.crichype.ProductService.Repository;

import com.crichype.ProductService.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

