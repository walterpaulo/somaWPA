package br.com.unoseg.somaWPA.repositorys;

import br.com.unoseg.somaWPA.models.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentModel, Long> {
}
