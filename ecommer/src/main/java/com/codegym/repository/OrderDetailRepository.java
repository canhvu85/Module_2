package com.codegym.repository;

import com.codegym.model.OrderDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderDetailRepository extends PagingAndSortingRepository<OrderDetail, Long> {
}
