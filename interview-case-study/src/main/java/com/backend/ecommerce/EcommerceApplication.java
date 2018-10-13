package com.baeldung.ecommerce;

import com.baeldung.ecommerce.model.Product;
import com.baeldung.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Breideker", 17.90, "http://placehold.it/200x100"));
            productService.save(new Product(2L, "Chardonnay", 18.90, "http://placehold.it/200x100"));
            productService.save(new Product(3L, "Gewurztraminer", 22.90, "http://placehold.it/200x100"));
            productService.save(new Product(4L, "Hukapapa Dessert Riesling", 21.90, "http://placehold.it/200x100"));
            productService.save(new Product(5L, "Late Harvest", 21.90, "http://placehold.it/200x100"));
            productService.save(new Product(6L, "Mirumiru (TM) Reserve", 28.90, "http://placehold.it/200x100"));
            productService.save(new Product(7L, "Mirumiru (TM) Rose", 34.00, "http://placehold.it/200x100"));
            productService.save(new Product(8L, "Pinota Gris", 18.90, "http://placehold.it/200x100"));
            productService.save(new Product(9L, "Pinota Noir", 28.90, "http://placehold.it/200x100"));
        };
    }
}
