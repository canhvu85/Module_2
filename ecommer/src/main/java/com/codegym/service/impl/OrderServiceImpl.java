package com.codegym.service.impl;

import com.codegym.model.Order;
import com.codegym.repository.OrderRepository;
import com.codegym.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
