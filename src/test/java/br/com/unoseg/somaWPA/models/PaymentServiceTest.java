package br.com.unoseg.somaWPA.models;

import br.com.unoseg.somaWPA.repositorys.PaymentRepository;
import br.com.unoseg.somaWPA.services.PaymentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
public class PaymentServiceTest {

    @TestConfiguration
    static class PaymentServiceTestConfiguretion{
        @Bean
        static PaymentService paymentService(){
            return new PaymentService();
        }

    }

    @Autowired
    PaymentService paymentService;

    @MockBean
    PaymentRepository paymentRepository;

    @Before
    public void setup(){
        PaymentModel paymentModel = new PaymentModel(1L,"TendTud");
        paymentModel.paidAccount();
        Mockito.when(paymentRepository.findByAccount(paymentModel.getAccount()))
                .thenReturn(Optional.of(paymentModel));

        PaymentModel wpseg = new PaymentModel(2L,"WPseg");
        Mockito.when(paymentRepository.save(wpseg))
                .thenReturn(wpseg);
    }

    @Test
    public void confirmPayment_test(){
        String account = "TendTud";
        Boolean paymentStatus = paymentService.confirmPaymentaccount(account);
        Assert.assertEquals(paymentStatus, true);
    }
    @Test
    public void findPayment_test(){
        String account = "WPseg";
        Optional<PaymentModel> payment = paymentService.findPayment(account);
        Assert.assertEquals(payment.isEmpty(), false);
    }

}
