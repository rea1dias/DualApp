package com.example.dual_app.service;


import com.example.dual_app.entity.Products;
import com.example.dual_app.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {


    @Autowired
    private ProductsRepository pRepo;

    public void save(Products p) {

        pRepo.save(p);
    }

    public List<Products> getAllProducts() {
        return pRepo.findAll();
    }

}
