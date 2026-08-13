package com.salman98.razorpay.payment.config;

import com.salman98.razorpay.common.enums.PaymentMethod;
import com.salman98.razorpay.payment.processor.PaymentProcessor;
import com.salman98.razorpay.payment.processor.strategy.CardPaymentProcessor;
import com.salman98.razorpay.payment.processor.strategy.NetBankingPaymentProcessor;
import com.salman98.razorpay.payment.processor.strategy.UpiPaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class PaymentProcessorConfig {

    @Bean
    public Map<PaymentMethod, PaymentProcessor> paymentProcessorMap() {
        return Map.of(
                PaymentMethod.CARD, new CardPaymentProcessor(),
                PaymentMethod.NETBANKING, new NetBankingPaymentProcessor(),
                PaymentMethod.UPI, new UpiPaymentProcessor()
        );
    }
}
