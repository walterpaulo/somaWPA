package br.com.unoseg.somaWPA.repositorys;

import br.com.unoseg.somaWPA.models.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<PaymentModel, Long> {

    Optional<PaymentModel> findByAccount(String account);
}
