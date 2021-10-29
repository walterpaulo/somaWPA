package br.com.unoseg.somaWPA.repositorys;


import br.com.unoseg.somaWPA.models.AccountModel;
import br.com.unoseg.somaWPA.models.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel, Long> {

    Optional<AccountModel> findByName(String account);
}
