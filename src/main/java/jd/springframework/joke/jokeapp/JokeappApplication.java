package jd.springframework.joke.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokeappApplication {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(JokeappApplication.class, args);
    }

}
