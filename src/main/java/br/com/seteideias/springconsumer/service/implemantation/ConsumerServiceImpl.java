package br.com.seteideias.springconsumer.service.implemantation;

import br.com.seteideias.springconsumer.dto.Message;
import br.com.seteideias.springconsumer.service.ConsumerService;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.Date;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void acaoObrigatoriaDeQuandoRealizarOConsumer(Message message) {
        Message message1 = new Message(message.getText(),message.getText2(),new Date());
        System.err.printf(message1.getText()+"\n");
        System.err.printf(message1.getText2()+"\n");
        System.err.printf(message1.getDate()+"\n");
    }

}
