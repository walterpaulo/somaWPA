package br.com.unoseg.somaWPA.models;

import br.com.unoseg.somaWPA.repositorys.PaymentRepository;
import br.com.unoseg.somaWPA.services.PaymentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.stream.Collectors;

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
        AccountModel ac1 = new AccountModel(2L,"TendTudo");
        PaymentModel paymentModel = new PaymentModel(1L,ac1);
        paymentModel.paidAccount();
        Mockito.when(paymentRepository.findById(paymentModel.getId()))
                .thenReturn(Optional.of(paymentModel));

//        PaymentModel wpseg = new PaymentModel(2L,new AccountModel("WPseg"));
//        wpseg.paidAccount();
//        Mockito.when(paymentRepository.findById(2L)).thenReturn(Optional.of(wpseg));

    }


    @Test
    public void confirmPayment_test(){
        Long accountnumber = 1L;
        Boolean paymentStatus = paymentService.confirmPaymentaccount(accountnumber);
        Assert.assertEquals(paymentStatus, true);
    }
//    @Test
//    public void findPayment_test(){
//        Long idAccount = 2L;
//        Optional<PaymentModel> payment = paymentService.findBy(idAccount);
//        boolean pay = payment.get().getPaid();
//        Assert.assertEquals(pay, true);
//    }

}
