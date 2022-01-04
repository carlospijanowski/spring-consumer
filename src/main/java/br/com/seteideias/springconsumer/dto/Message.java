package br.com.seteideias.springconsumer.dto;

import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Getter
public class Message {

    private String text;
    private Date date;
    private String text2;

    public Message(String text, String text2, Date date) {
        this.text = text;
        this.date = date;
        this.text2 = text2;
    }
}
