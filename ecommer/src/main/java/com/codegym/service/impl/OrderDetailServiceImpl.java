package com.codegym.service.impl;

import com.codegym.model.Order;
import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import com.codegym.service.OrderDetailService;
import com.codegym.service.OrderService;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    ProductService productService;
    @Autowired
    OrderService orderService;
    @Override
    public int isExisting(Order oder, Long id) {
        Product product = productService.findById(id);
        Order order = orderService.findById(oder.getId());
        if(product != null && order != null){
            return 1;
        }
        return -1;
    }
}
