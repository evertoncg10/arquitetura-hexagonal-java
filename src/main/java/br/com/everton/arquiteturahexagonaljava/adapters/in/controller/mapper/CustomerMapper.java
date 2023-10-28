package br.com.everton.arquiteturahexagonaljava.adapters.in.controller.mapper;

import br.com.everton.arquiteturahexagonaljava.adapters.in.controller.request.CustomerRequest;
import br.com.everton.arquiteturahexagonaljava.adapters.in.controller.response.CustomerResponse;
import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
