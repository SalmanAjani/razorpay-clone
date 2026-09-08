package com.salman98.razorpay.payment.processor.strategy;

import com.salman98.razorpay.common.util.RandomizerUtil;
import com.salman98.razorpay.payment.processor.PaymentProcessor;
import com.salman98.razorpay.payment.processor.dto.PaymentProcessorRequest;
import com.salman98.razorpay.payment.processor.dto.PaymentProcessorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UpiPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentProcessorResponse charge(PaymentProcessorRequest request) {

        final String VPA_CODE_FAIL = "fail@okaxis";

        String bankCode = request.methodDetails() != null ?
                request.methodDetails().get("vpa").toString() : null;

        // simulation
        if (VPA_CODE_FAIL.equals(bankCode)) {
            return new PaymentProcessorResponse.Failure("UPI_REJECTED",
                    "Banked rejected the transaction registration"
            );
        }

        String processorRef = "UPI_PROCESSOR_" + RandomizerUtil.randomBase64(16);

        return new PaymentProcessorResponse.Pending(processorRef);
    }
}
