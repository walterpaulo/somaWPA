package br.com.unoseg.somaWPA.models;

import br.com.unoseg.somaWPA.services.PaymentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

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

    @Test
    public void confirmPayment_test(){
        String account = "TendTud";
        Boolean paymentStatus = paymentService.confirmPaymentaccount(account);
        Assert.assertEquals(paymentStatus, true);
    }

}
