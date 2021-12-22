package com.usa.habilitacion;

import com.usa.habilitacion.repository.crudrepository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HabilitacionApplication implements CommandLineRunner {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(HabilitacionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    productCrudRepository.deleteAll();
    }
}
