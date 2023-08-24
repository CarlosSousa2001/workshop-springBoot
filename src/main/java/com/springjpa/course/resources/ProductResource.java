package com.springjpa.course.resources;

import com.springjpa.course.entities.Product;
import com.springjpa.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        List products = productService.findAll();
        return ResponseEntity.ok().body(products);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id){
        Product product = productService.findById(id);
        if(product != null){
            return ResponseEntity.ok().body(product);
        }
        return null;
    }

}
