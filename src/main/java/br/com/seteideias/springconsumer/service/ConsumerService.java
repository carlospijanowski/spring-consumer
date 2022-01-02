package br.com.seteideias.springconsumer.service;

import br.com.seteideias.springconsumer.dto.Message;
import org.springframework.context.annotation.Bean;


public interface ConsumerService {

    void acaoObrigatoriaDeQuandoRealizarOConsumer(Message message);

}
