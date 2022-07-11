package com.nttdata.products.api;

import com.nttdata.products.model.document.Product;
import com.nttdata.products.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/product")
public class ProductoController {
    @Autowired
    ProductService productService;

    @GetMapping
    public Flux<Product> getAll(){
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Mono<Product> getOne(@PathVariable long id){
        return productService.findById(id);
    }
}
