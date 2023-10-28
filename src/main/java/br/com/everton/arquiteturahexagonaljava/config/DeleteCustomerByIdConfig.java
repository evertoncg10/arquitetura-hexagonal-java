package br.com.everton.arquiteturahexagonaljava.config;

import br.com.everton.arquiteturahexagonaljava.adapters.out.DeleteCustomerByIdAdapter;
import br.com.everton.arquiteturahexagonaljava.application.core.usecase.DeleteCustomerByIdUseCase;
import br.com.everton.arquiteturahexagonaljava.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}