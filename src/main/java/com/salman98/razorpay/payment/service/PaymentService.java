package com.salman98.razorpay.payment.service;

import com.salman98.razorpay.payment.dto.request.PaymentInitRequest;
import com.salman98.razorpay.payment.dto.response.PaymentResponse;

import java.util.UUID;

public interface PaymentService {
    PaymentResponse initiate(UUID merchantId, PaymentInitRequest request);

    PaymentResponse capture(UUID merchantId, UUID paymentId);
}
