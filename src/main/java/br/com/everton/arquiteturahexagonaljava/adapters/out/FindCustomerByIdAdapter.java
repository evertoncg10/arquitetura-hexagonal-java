package br.com.everton.arquiteturahexagonaljava.adapters.out;

import br.com.everton.arquiteturahexagonaljava.adapters.out.repository.CustomerRepository;
import br.com.everton.arquiteturahexagonaljava.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;
import br.com.everton.arquiteturahexagonaljava.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
