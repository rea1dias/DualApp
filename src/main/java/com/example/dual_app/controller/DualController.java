package com.example.dual_app.controller;

import com.example.dual_app.entity.Products;
import com.example.dual_app.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.List;

import java.util.*;

@Controller
public class DualController {


    @Autowired
    private ProductsService service;


    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/product_register")
    public String productRegister() {
        return "productRegister";
    }

    @GetMapping("available_products")
    public ModelAndView getAllProducts() {
        List<Products>list=service.getAllProducts();
//        ModelAndView m = new ModelAndView();
//        m.setViewName("productsList");
//        m.addObject("products",list);
        return new ModelAndView("productsList","products",list);
    }

    @PostMapping("/save")
    public String addProducts(@ModelAttribute Products p) {
        service.save(p);
        return "redirect:/available_products";
    }



}
