package com.fmy.microservices.order.service;

import org.springframework.stereotype.Service;
import com.fmy.microservices.order.dto.OrderRequest;
import com.fmy.microservices.order.model.Order;
import com.fmy.microservices.order.repository.OrderRepository;

import java.util.UUID;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);
    }
}
