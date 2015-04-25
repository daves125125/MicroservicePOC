package com.djh.beverage;

import com.djh.beverage.core.service.BeverageService;
import com.djh.beverage.core.service.CocaColaBeverageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author David Hancock
 */
@SpringBootApplication
public class BeverageLoader {

    @Bean
    public BeverageService beverageService() {
        return new CocaColaBeverageService();
    }

    public static void main(String[] args) {
        SpringApplication.run(BeverageLoader.class, args);
    }

}
