package org.example.config;

import org.example.domain.Movie;
import org.springframework.context.annotation.Bean;

public class MovieConfig {

    @Bean("movie")
    public Movie getMovie(){
        return new Movie(1,"PK","12/02/2012");
    }

    @Bean("movie1")
    public Movie getMovie1(){
        return new Movie(2,"Gajani","15/02/2010");
    }
}
