package io.kyrios.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"io.kyrios"})
@EntityScan(basePackages = {"io.kyrios"})
@ComponentScan(basePackages = {"io.kyrios"})
public class KyriosApplication {
    public static void main(String[] args) {
        SpringApplication.run(KyriosApplication.class, args);
    }
}
