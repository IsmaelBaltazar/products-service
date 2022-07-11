package com.nttdata.products.service;

import com.nttdata.products.model.document.Product;
import com.nttdata.products.model.repository.ProductRepository;
import com.nttdata.products.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Override
    public Flux<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Product> findById(Long id) {
        return repository.findById(id);
    }
}
