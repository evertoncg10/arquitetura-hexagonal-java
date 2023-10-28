package br.com.everton.arquiteturahexagonaljava.adapters.out.client.mapper;

import br.com.everton.arquiteturahexagonaljava.adapters.out.client.response.AddressResponse;
import br.com.everton.arquiteturahexagonaljava.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
