package com.example.sheepshop.rest;

import com.example.sheepshop.services.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:8080" , "http://127.0.0.1:8080"})
@RestController
@RequestMapping("/api/category")
public class CategoryRest {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(categoryService.getAllAPI());
    }

}
