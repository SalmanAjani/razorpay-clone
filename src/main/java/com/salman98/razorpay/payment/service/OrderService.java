package com.salman98.razorpay.payment.service;

import com.salman98.razorpay.payment.dto.request.CreateOrderRequest;
import com.salman98.razorpay.payment.dto.response.OrderResponse;

import java.util.UUID;

public interface OrderService {
    OrderResponse create(UUID merchantId, CreateOrderRequest request);
}
