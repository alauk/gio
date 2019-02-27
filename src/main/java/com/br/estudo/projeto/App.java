package com.br.estudo.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = {"com.br.estudo.projeto.repository"})
@EntityScan(basePackages = {"com.br.estudo.projeto.entity"})
@ComponentScan(basePackages = {"com.br.estudo.projeto"})
@SpringBootApplication
public class App {
	public static void main(String...strings) {
		SpringApplication.run(App.class, strings);
	}
}
