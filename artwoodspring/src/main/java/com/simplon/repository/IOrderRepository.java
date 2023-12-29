package com.simplon.repository;

import com.simplon.entity.Order;
import org.springframework.stereotype.Repository;



@Repository
public interface IOrderRepository extends IGenericRepository<Order, Integer> {
}
