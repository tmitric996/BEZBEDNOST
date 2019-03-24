package com.example.Projekat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.Projekat.dao.KorisnikDAO;
import com.example.Projekat.repo.KorisnikRepo;


@SpringBootApplication
@ComponentScan({"com.example.Projekat.dao", "com.example.Projekat.repo"})
@EnableJpaRepositories("com.example.Projekat")
public class ProjekatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjekatApplication.class, args);
	}

}
