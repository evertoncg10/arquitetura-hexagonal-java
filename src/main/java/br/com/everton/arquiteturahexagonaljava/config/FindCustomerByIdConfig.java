package br.com.everton.arquiteturahexagonaljava.config;

import br.com.everton.arquiteturahexagonaljava.adapters.out.FindCustomerByIdAdapter;
import br.com.everton.arquiteturahexagonaljava.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
