package br.com.everton.arquiteturahexagonaljava.application.ports.in;

import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
