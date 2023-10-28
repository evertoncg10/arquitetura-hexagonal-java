package br.com.everton.arquiteturahexagonaljava.adapters.in.consumer.mapper;

import br.com.everton.arquiteturahexagonaljava.adapters.in.consumer.message.CustomerMessage;
import br.com.everton.arquiteturahexagonaljava.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
