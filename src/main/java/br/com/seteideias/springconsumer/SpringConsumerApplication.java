package br.com.seteideias.springconsumer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "API REST Consumidora")
@SpringBootApplication
@RestController
@RequestMapping(value = "/")
public class SpringConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConsumerApplication.class, args);
    }

    @ApiOperation(value = "apenas uma mensagem de retorno")
    @RequestMapping(value = "/")
    public String endPointDeTest(){
        return "apenas um retorno de teste";
    }

}
