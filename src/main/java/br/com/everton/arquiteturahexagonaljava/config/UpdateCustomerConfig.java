package br.com.everton.arquiteturahexagonaljava.config;

import br.com.everton.arquiteturahexagonaljava.adapters.out.FindAddressByZipCodeAdapter;
import br.com.everton.arquiteturahexagonaljava.adapters.out.UpdateCustomerAdapter;
import br.com.everton.arquiteturahexagonaljava.application.core.usecase.FindCustomerByIdUseCase;
import br.com.everton.arquiteturahexagonaljava.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
