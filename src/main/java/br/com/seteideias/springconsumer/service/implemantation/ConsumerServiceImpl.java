package br.com.seteideias.springconsumer.service.implemantation;

import br.com.seteideias.springconsumer.dto.Message;
import br.com.seteideias.springconsumer.service.ConsumerService;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void acaoObrigatoriaDeQuandoRealizarOConsumer(Message message) {
        System.err.printf(message.getText());
    }

}
