package com.salman98.razorpay.payment.processor.strategy;

import com.salman98.razorpay.payment.processor.PaymentProcessor;
import com.salman98.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.salman98.razorpay.payment.processor.dto.PaymentProcessorResponse;

public class UpiPaymentProcessor implements PaymentProcessor {
    
    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {
        return null;
    }
}
