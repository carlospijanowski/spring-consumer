package br.com.seteideias.springconsumer.amqp;

public interface AmqpConsumer<T> {

    void implementacaoObrigatoria(T genericoASerConsumido);

}
