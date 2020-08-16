package com.inventory.management.controller;

import com.inventory.management.models.Sale;
import com.inventory.management.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
@CrossOrigin(origins = "*")
public class SalesController {

    private ProductRepository repository;

    SalesController(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Sale sale) {
        repository.findById(id)
                .map(product -> {
                    product.sellProduct(sale);
                    repository.save(product);
                    return null;
                });
    }
}
