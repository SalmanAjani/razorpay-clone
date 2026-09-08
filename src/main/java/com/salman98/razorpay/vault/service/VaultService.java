package com.salman98.razorpay.vault.service;

import com.salman98.razorpay.common.entity.Money;
import com.salman98.razorpay.payment.processor.dto.PaymentProcessorResponse;
import com.salman98.razorpay.vault.dto.request.TokenizeRequest;
import com.salman98.razorpay.vault.dto.response.TokenizeResponse;
import jakarta.validation.Valid;

import java.util.Map;
import java.util.UUID;

public interface VaultService {
    TokenizeResponse tokenize(@Valid TokenizeRequest request, UUID merchantId);

    PaymentProcessorResponse charge(UUID paymentId, String token, Money amount, Map<String, Object> methodDetails);
}
