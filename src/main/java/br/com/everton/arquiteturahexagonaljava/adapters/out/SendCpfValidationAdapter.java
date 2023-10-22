package br.com.everton.arquiteturahexagonaljava.adapters.out;

import br.com.everton.arquiteturahexagonaljava.application.ports.out.SendCpfForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfValidationAdapter implements SendCpfForValidationOutputPort {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
