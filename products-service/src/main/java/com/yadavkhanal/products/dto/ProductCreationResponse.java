package com.yadavkhanal.products.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductCreationResponse {
    private UUID id;
    private String name;
    private BigDecimal price;
    private Integer quantity;

    public ProductCreationResponse(UUID productId, Integer quantity) {
        this.id = productId;
        this.quantity = quantity;
    }
}
