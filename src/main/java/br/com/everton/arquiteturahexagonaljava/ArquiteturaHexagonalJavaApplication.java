package br.com.everton.arquiteturahexagonaljava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ArquiteturaHexagonalJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquiteturaHexagonalJavaApplication.class, args);
	}

}
