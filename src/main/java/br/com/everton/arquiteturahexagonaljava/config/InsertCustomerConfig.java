package br.com.everton.arquiteturahexagonaljava.config;

import br.com.everton.arquiteturahexagonaljava.adapters.out.FindAddressByZipCodeAdapter;
import br.com.everton.arquiteturahexagonaljava.adapters.out.InsertCustomerAdapter;
import br.com.everton.arquiteturahexagonaljava.adapters.out.SendCpfValidationAdapter;
import br.com.everton.arquiteturahexagonaljava.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
