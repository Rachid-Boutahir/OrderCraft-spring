package com.simplon.service;

import java.util.List;

import com.simplon.entity.Order;



public interface IOrderService {
    public List<Order> getOrders();
    public void saveOrder(Order theOrder);

    public Order getOrder(int id);

    public void deleteOrder(int id);
}
