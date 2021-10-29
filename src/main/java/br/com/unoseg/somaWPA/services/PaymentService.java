package br.com.unoseg.somaWPA.services;

import br.com.unoseg.somaWPA.models.AccountModel;
import br.com.unoseg.somaWPA.models.PaymentModel;
import br.com.unoseg.somaWPA.repositorys.AccountRepository;
import br.com.unoseg.somaWPA.repositorys.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private AccountRepository accountRepositoyr;

    public boolean confirmPaymentaccount(Long accountnumber) {
        Optional<PaymentModel> paymentModelOptional = paymentRepository.findById(accountnumber);
        return paymentModelOptional.isPresent();
    }

    public Optional<PaymentModel> findPayment(Long accountnumber) {
        Optional<PaymentModel> paymentModel = paymentRepository.findById(accountnumber);
        return paymentModel;
    }
    public Optional<PaymentModel> findBy(Long id){
        return paymentRepository.findById(id);
    }
}
