package com.springjpa.course.resources;

import com.springjpa.course.entities.Category;
import com.springjpa.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAll(){
        List categories = categoryService.findAll();
        return ResponseEntity.ok().body(categories);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> getById(@PathVariable Long id){
        Category category = categoryService.findById(id);
        if(category != null){
            return ResponseEntity.ok().body(category);
        }
        return null;
    }

}
