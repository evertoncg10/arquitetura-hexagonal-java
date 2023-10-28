package br.com.everton.arquiteturahexagonaljava.application.core.usecase;

import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;
import br.com.everton.arquiteturahexagonaljava.application.ports.in.FindCustomerByIdInputPort;
import br.com.everton.arquiteturahexagonaljava.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return  findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
