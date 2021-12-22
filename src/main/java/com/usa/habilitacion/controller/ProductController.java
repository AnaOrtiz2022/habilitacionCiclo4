package com.usa.habilitacion.controller;

import com.usa.habilitacion.model.Product;
import com.usa.habilitacion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @GetMapping("/{reference}")
    public Optional<Product> getProduct(@PathVariable("reference") String reference){
        return productService.getProduct(reference);
    }
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Product product){
        productService.save(product);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }
    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference){
        return productService.delete(reference);
    }
    @GetMapping("/description/{description}")
    public List<Product> findByDescriptionContainingIgnoreCase(@PathVariable("description") String description){
        return productService.findByDescriptionContainingIgnoreCase(description);
    }
    @GetMapping("/price/{price}")
    public List<Product> findByPriceLessThanEqual(@PathVariable("price") Double price){
        return productService.findByPriceLessThanEqual(price);
    }
}