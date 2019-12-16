package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductRepository productRepository;
    @GetMapping("/list")
    public ModelAndView showListProduct(){
        Iterable<Product> products = productRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("/product/index");
        modelAndView.addObject("products", products);
        return modelAndView;
    }
}
