package com.springframework.controllers;

import com.springframework.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by Devender on 19/05/18.
 */
public class IndexControllerTest {

    @Mock
    private RecipeService recipeService;

    @Mock
    private Model model;

    private IndexController controller;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        controller = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {

        // Here we don't need to write the when statement, because we are not doing anything with the model
        // and whatever we are doing with model can be alternatively tested via verify statements
        String viewName = controller.getIndexPage(model);

        assertEquals("index", viewName);

        // Verifying the interactions and arguments with verify statements
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet());
    }

}