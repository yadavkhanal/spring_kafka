package com.yadavkhanal.common.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Shipment {
    private UUID id;
    private UUID orderId;
    private UUID paymentId;


    public Shipment(UUID id, UUID orderId, UUID paymentId) {
        this.id = id;
        this.orderId = orderId;
        this.paymentId = paymentId;
    }

    public Shipment(UUID orderId, UUID paymentId) {
        this.orderId = orderId;
        this.paymentId = paymentId;
    }
}
