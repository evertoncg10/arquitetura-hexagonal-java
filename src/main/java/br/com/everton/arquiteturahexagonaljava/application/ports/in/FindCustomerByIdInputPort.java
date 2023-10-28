package br.com.everton.arquiteturahexagonaljava.application.ports.in;

import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
