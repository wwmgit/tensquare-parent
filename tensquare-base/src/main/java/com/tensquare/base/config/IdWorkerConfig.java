package com.tensquare.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import util.IdWorker;

@Configuration
public class IdWorkerConfig {

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1, 1);
    }

}
