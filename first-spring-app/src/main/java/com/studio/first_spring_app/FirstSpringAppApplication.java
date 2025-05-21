package com.studio.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication // é o ponto de entrada da aplicação e ativa a configuração automaticando, rodando o projeto
@Configuration // Usada para declarar beans manualmente com @bean
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);}

}
