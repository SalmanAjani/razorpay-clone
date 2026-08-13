package com.salman98.razorpay.payment.gateway;

import com.salman98.razorpay.payment.gateway.dto.PaymentRequest;
import com.salman98.razorpay.payment.gateway.dto.PaymentResult;

public interface PaymentAdapter {

    PaymentResult initiate(PaymentRequest request);
}
