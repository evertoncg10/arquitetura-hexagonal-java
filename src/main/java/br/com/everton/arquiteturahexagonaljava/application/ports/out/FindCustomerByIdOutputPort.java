package br.com.everton.arquiteturahexagonaljava.application.ports.out;

import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
