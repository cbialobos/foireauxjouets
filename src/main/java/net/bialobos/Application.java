package net.bialobos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner loadData(JouetRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Jouet("Poupée", 20d));
            repository.save(new Jouet("Poussette", 100d));
            repository.save(new Jouet("Livre", 1d));
            repository.save(new Jouet("Mille bornes", 5d));
            repository.save(new Jouet("Qui est-ce", 10d));
        };
    }
}