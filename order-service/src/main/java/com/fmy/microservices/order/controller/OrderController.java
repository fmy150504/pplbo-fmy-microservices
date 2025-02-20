package com.fmy.microservices.order.controller;

import com.fmy.microservices.order.dto.OrderRequest;
import com.fmy.microservices.order.service.OrderService;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}
