package tech.com.Agregador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.com.Agregador.entity.AccountStock;
import tech.com.Agregador.entity.AccountStockId;

@Repository
public interface AccountStockRepository
        extends JpaRepository<AccountStock, AccountStockId> {
}
