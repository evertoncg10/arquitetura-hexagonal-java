package br.com.everton.arquiteturahexagonaljava.adapters.in.controller.response;

import br.com.everton.arquiteturahexagonaljava.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private Address address;

    private String cpf;

    private boolean isValidCpf;
}
