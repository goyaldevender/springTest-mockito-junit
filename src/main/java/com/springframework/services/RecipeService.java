package com.springframework.services;

import com.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Devender on 18/05/18.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
