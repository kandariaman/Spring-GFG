package com.SpringGFG.demo.config;

import com.SpringGFG.demo.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Movie movieBean(){
        return new Movie("defaultMovie","Comedy", 3.0, 0);
    }
}
