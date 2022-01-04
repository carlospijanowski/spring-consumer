package br.com.seteideias.springconsumer.implementation;

import br.com.seteideias.springconsumer.amqp.AmqpConsumer;
import br.com.seteideias.springconsumer.dto.Message;
import br.com.seteideias.springconsumer.service.ConsumerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Message> {

    @Autowired
    private ConsumerService consumerService;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void implementacaoObrigatoria(Message message) {
        consumerService.acaoObrigatoriaDeQuandoRealizarOConsumer(message);
    }

}
