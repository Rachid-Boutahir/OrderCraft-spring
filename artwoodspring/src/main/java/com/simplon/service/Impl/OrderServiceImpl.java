package com.simplon.service.Impl;

import com.simplon.entity.Order;
import com.simplon.service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Override
    public List<Order> getOrders() {
        return null;
    }

    @Override
    public void saveOrder(Order theOrder) {

    }

    @Override
    public Order getOrder(int id) {
        return null;
    }

    @Override
    public void deleteOrder(int id) {

    }
}
