package com.salman98.razorpay.payment.processor.dto;

import com.salman98.razorpay.common.entity.Money;
import com.salman98.razorpay.common.enums.PaymentMethod;

import java.util.Map;

public record PaymentProcessorRequest(
        PaymentMethod method,
        Money amount,
        Map<String, Object> methodDetails
) {
}
