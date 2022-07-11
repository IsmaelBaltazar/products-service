package com.nttdata.products.model.repository;

import com.nttdata.products.model.document.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, Long> {
}
