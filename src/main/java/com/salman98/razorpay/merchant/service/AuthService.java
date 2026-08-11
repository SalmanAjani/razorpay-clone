package com.salman98.razorpay.merchant.service;

import com.salman98.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.salman98.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
    MerchantResponse signup(MerchantSignupRequest request);
}
