package br.com.unoseg.somaWPA.services;

import br.com.unoseg.somaWPA.repositorys.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public boolean confirmPaymentaccount(String account) {
        return true;
    }
}
