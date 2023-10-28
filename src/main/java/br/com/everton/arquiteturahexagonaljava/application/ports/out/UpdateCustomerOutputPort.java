package br.com.everton.arquiteturahexagonaljava.application.ports.out;

import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
