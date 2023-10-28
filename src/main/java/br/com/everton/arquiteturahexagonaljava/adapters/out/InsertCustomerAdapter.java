package br.com.everton.arquiteturahexagonaljava.adapters.out;

import br.com.everton.arquiteturahexagonaljava.adapters.out.repository.CustomerRepository;
import br.com.everton.arquiteturahexagonaljava.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;
import br.com.everton.arquiteturahexagonaljava.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
