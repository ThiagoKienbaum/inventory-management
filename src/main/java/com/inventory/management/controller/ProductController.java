package com.inventory.management.controller;

import com.inventory.management.models.Product;
import com.inventory.management.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inventory")
@CrossOrigin(origins = "*")
public class ProductController {

    private ProductRepository repository;

    ProductController(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    @PostMapping
    public Product store(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping
    public List<Product> index() {
        return repository.findAll();
    }

    @GetMapping("/{category}")
    public List<Product> show(@PathVariable("category") String category) {
        return repository.findByCategory(category);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return repository.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
}
