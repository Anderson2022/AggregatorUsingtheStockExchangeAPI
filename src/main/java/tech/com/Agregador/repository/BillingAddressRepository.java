package tech.com.Agregador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.com.Agregador.entity.BillingAddress;
import tech.com.Agregador.entity.User;

import java.util.UUID;


@Repository
public interface BillingAddressRepository
        extends JpaRepository<BillingAddress, UUID> {
}