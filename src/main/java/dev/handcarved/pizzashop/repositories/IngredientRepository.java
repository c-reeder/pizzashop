package dev.handcarved.pizzashop.repositories;

import dev.handcarved.pizzashop.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface IngredientRepository extends CrudRepository<Ingredient, UUID> {
    List<Ingredient> findAll();
}
