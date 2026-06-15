package com.lauin.store.payments;

import lombok.Data;

@Data
public class CheckoutResponse {
    private Long orderId;
    public String checkoutUrl;

    public CheckoutResponse(Long orderId, String checkoutUrl) {
        this.orderId = orderId;
        this.checkoutUrl = checkoutUrl;
    }
}
