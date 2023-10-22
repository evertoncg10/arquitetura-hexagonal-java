package br.com.everton.arquiteturahexagonaljava.adapters.in.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMessage {

    private String id;

    private String name;

    private String zipCode;

    private String cpf;

    private boolean isValidCpf;
}
