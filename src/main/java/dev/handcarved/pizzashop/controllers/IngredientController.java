package dev.handcarved.pizzashop.controllers;

import dev.handcarved.pizzashop.models.Ingredient;
import dev.handcarved.pizzashop.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(path = "/ingredient")
public class IngredientController {
    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("")
    public List<Ingredient> getAllAnimals() {
        return ingredientRepository.findAll();
    }
}
