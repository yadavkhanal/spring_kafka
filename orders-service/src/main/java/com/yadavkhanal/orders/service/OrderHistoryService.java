package com.yadavkhanal.orders.service;

import com.yadavkhanal.common.types.OrderStatus;
import com.yadavkhanal.orders.dto.OrderHistory;

import java.util.List;
import java.util.UUID;

public interface OrderHistoryService {
    void add(UUID orderId, OrderStatus orderStatus);

    List<OrderHistory> findByOrderId(UUID orderId);
}
