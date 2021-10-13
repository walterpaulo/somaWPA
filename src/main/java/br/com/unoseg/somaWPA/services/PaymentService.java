package br.com.unoseg.somaWPA.services;

import br.com.unoseg.somaWPA.models.PaymentModel;
import br.com.unoseg.somaWPA.repositorys.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public boolean confirmPaymentaccount(String account) {
        Optional<PaymentModel> paymentModelOptional = paymentRepository.findByAccount(account);
        return paymentModelOptional.map(p -> p.getPaid()).get();
    }
}
