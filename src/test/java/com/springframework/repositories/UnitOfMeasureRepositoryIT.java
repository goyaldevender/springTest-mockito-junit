package com.springframework.repositories;

import com.springframework.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Created by Devender on 05/19/
 * Description: This is an Integration test, because we are running the spring context and connecting the temporary
 *              database.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    // Because we are booting up the spring context also, hence we can use Autowire
    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp(){
    }

    @Test
    public void findByDescription() {

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", uomOptional.get().getDescription());
    }

    // This test will run faster than the earlier test because the spring context is already up
    @Test
    public void findByDescriptionCup() {

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");

        assertEquals("Cup", uomOptional.get().getDescription());
    }

}