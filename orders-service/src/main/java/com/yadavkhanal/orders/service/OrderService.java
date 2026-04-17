package com.yadavkhanal.orders.service;

import com.yadavkhanal.common.dto.Order;

import java.util.UUID;

public interface OrderService {
    Order placeOrder(Order order);
    void approveOrder(UUID orderId);
}
