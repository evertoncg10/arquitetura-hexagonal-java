package br.com.everton.arquiteturahexagonaljava.adapters.out.repository.mapper;

import br.com.everton.arquiteturahexagonaljava.adapters.out.repository.entity.CustomerEntity;
import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
