package br.com.everton.arquiteturahexagonaljava.application.ports.out;

import br.com.everton.arquiteturahexagonaljava.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
