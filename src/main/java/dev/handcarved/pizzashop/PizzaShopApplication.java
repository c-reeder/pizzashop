package dev.handcarved.pizzashop;

import dev.handcarved.pizzashop.models.Ingredient;
import dev.handcarved.pizzashop.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class PizzaShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzaShopApplication.class, args);
    }

}
