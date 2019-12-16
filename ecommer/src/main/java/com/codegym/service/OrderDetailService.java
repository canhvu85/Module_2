package com.codegym.service;

import com.codegym.model.Order;

public interface OrderDetailService {
    int isExisting(Order oder, Long id);
}
