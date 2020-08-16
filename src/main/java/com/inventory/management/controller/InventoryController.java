package com.inventory.management.controller;

import com.inventory.management.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
@CrossOrigin(origins = "*")
public class InventoryController {

    private ProductRepository repository;

    InventoryController(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Integer quantityToAdd) {
        repository.findById(id)
                .map(product -> {
                    product.addProductToInventory(quantityToAdd);
                    repository.save(product);
                    return null;
                });
    }
}
