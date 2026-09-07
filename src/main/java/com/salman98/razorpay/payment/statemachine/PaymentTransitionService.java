package com.salman98.razorpay.payment.statemachine;

import com.salman98.razorpay.common.enums.PaymentActor;
import com.salman98.razorpay.common.enums.PaymentEvent;
import com.salman98.razorpay.common.enums.PaymentStatus;
import com.salman98.razorpay.payment.entity.Payment;
import com.salman98.razorpay.payment.entity.PaymentTransitionLog;
import com.salman98.razorpay.payment.repository.PaymentTransitionLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PaymentTransitionService {

    private final PaymentTransitionLogRepository paymentTransitionLogRepository;
    private final PaymentStateMachine paymentStateMachine;

    public PaymentStatus apply(Payment payment, PaymentEvent event) {

        PaymentStatus next = paymentStateMachine.transition(payment.getStatus(), event);
        payment.setStatus(next);

        PaymentTransitionLog log = PaymentTransitionLog.builder()
                .payment(payment)
                .fromStatus(payment.getStatus())
                .event(event)
                .toStatus(next)
                .actor(PaymentActor.SYSTEM) //TODO: fetch merchant context to identify actor
                .occurredAt(LocalDateTime.now())
                .build();

        paymentTransitionLogRepository.save(log);
        
        return next;
    }
}
