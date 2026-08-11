package com.salman98.razorpay.merchant.mapper;

import com.salman98.razorpay.merchant.dto.response.ApiKeyResponse;
import com.salman98.razorpay.merchant.entity.ApiKey;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ApiKeyMapper {

    List<ApiKeyResponse> toResponseList(List<ApiKey> apiKeyList);
}
