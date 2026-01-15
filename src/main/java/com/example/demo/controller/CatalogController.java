package com.example.demo.controller;

//catalog//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.service.CatalogService;

import java.util.List;

@RestController
@RequestMapping("/api/catalog")
@CrossOrigin(origins = "http://localhost:4200") 
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return catalogService.listarCategorias();
    }

    @GetMapping("/products/category/{id}")
    public List<Product> getProducts(@PathVariable Long id) {
        return catalogService.listarPorCategoria(id);
    }
}
