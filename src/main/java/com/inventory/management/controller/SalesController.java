package com.inventory.management.controller;

import com.inventory.management.models.Product;
import com.inventory.management.models.Sale;
import com.inventory.management.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @ResponseBody
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Sale sale) {
        Product product = repository.findById(id).get();

        if (product.getQuantity() >= sale.getSoldQuantity()) {
            product.sellProduct(sale);
            repository.save(product);
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity("The quantity of sale it's over inventory total.", HttpStatus.BAD_REQUEST);
        }
    }
}
