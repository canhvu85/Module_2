package com.codegym.service;

import com.codegym.model.Order;

public interface OrderService {
    Order findById(Long id);
}
