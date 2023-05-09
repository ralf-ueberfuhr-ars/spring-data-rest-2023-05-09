package de.sample.spring.customers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.UUID;

@RepositoryRestResource(path = "customers")
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    @Override
    @RestResource(exported = false)
    void deleteById(UUID uuid);
}
