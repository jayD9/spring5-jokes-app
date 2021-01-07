package jd.springframework.joke.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokeappApplication {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(JokeappApplication.class, args);
    }

}
