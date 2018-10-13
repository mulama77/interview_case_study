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
            productService.save(new Product(1L, "Breideker", 17.90, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/09riesling.png"));
            productService.save(new Product(2L, "Chardonnay", 18.90, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/09riesling_v.png"));
            productService.save(new Product(3L, "Gewurztraminer", 22.90, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/Breidecker_small.jpg"));
            productService.save(new Product(4L, "Hukapapa Dessert Riesling", 21.90, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/Hukapapa_v.png"));
            productService.save(new Product(5L, "Late Harvest", 21.90, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/Hunters_Gewurztraminer_NV_-_webv.png"));
            productService.save(new Product(6L, "Mirumiru (TM) Reserve", 28.90, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/Hunters_Late_Harvest_Sauvignon-Blanc_NV_-_webv.png"));
            productService.save(new Product(7L, "Mirumiru (TM) Rose", 34.00, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/chardonnay_v_1.png"));
            productService.save(new Product(8L, "Pinota Gris", 18.90, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/hunters_mirumiru_non_vintage_PNG_v3.png"));
            productService.save(new Product(9L, "Pinota Noir", 28.90, "https://github.com/mulama77/angularjs-spring/blob/master/wine-bottles/pinotnoir_small_v_1.png"));
        };
    }
}
