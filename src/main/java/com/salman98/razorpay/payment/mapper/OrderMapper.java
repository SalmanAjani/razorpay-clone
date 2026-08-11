package com.salman98.razorpay.payment.mapper;

import com.salman98.razorpay.payment.dto.response.OrderResponse;
import com.salman98.razorpay.payment.entity.OrderRecord;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

    OrderResponse toResponse(OrderRecord orderRecord);
}
