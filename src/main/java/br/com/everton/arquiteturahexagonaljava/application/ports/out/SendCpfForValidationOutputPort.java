package br.com.everton.arquiteturahexagonaljava.application.ports.out;

public interface SendCpfForValidationOutputPort {
    void send(String cpf);
}
