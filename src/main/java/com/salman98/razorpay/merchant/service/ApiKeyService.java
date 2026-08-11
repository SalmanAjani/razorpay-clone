package com.salman98.razorpay.merchant.service;

import com.salman98.razorpay.merchant.dto.request.CreateApiKeyRequest;
import com.salman98.razorpay.merchant.dto.response.ApiKeyCreateResponse;

import java.util.UUID;

public interface ApiKeyService {
    ApiKeyCreateResponse create(UUID merchantId, CreateApiKeyRequest request);
}
