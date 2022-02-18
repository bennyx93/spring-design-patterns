package com.frankmoley.lil.designpatternsapp;

import com.frankmoley.lil.designpatternsapp.prototype.ProtoFalse;
import com.frankmoley.lil.designpatternsapp.prototype.ProtoTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DesignPatternsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsAppApplication.class, args);
    }

    @Bean
    public ProtoFalse protoFalse(){
        return new ProtoFalse();
    }

    @Bean
    @Scope("prototype")
    public ProtoTrue protoTrue(){
        return new ProtoTrue();
    }
}

