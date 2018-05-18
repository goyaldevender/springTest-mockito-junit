package com.springframework.repositories;

import com.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Devender on 18/05/18.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
