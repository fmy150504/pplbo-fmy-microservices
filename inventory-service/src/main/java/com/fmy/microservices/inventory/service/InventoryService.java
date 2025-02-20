package com.fmy.microservices.inventory.service;

import org.springframework.stereotype.Service;

import com.fmy.microservices.inventory.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
    public final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity){
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
