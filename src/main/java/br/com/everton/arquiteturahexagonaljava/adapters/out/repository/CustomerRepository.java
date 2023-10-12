package br.com.everton.arquiteturahexagonaljava.adapters.out.repository;

import br.com.everton.arquiteturahexagonaljava.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
