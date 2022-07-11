package com.nttdata.products.model.service;

import com.nttdata.products.model.document.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Flux<Product> getAll();
    Mono<Product> findById(Long id);
}
