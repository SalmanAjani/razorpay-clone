package com.salman98.razorpay.merchant.dto.request;

import com.salman98.razorpay.common.enums.Environment;

public record CreateApiKeyRequest(
        Environment environment
) {
}
