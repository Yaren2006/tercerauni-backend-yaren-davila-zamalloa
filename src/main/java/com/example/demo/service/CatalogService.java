package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CategoryRepository categoryRepo;

    @Autowired
    private ProductRepository productRepo;

    public List<Category> listarCategorias() {
        return categoryRepo.findAll();
    }

    public List<Product> listarPorCategoria(Long id) {
        return productRepo.findByCategoryId(id);
    }
}
