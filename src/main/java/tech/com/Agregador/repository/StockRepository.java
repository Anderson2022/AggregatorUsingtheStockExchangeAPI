package tech.com.Agregador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.com.Agregador.entity.Stock;




@Repository
public interface StockRepository extends JpaRepository<Stock, String> {
}