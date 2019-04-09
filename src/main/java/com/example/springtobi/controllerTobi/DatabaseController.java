package com.example.springtobi.controllerTobi;

import com.example.springtobi.entity.Meal;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller
@Transactional
public class DatabaseController
{

    @PersistenceContext
    private EntityManager entityManager;


    @GetMapping("/db")
    public String test()
    {


        Meal meal = new Meal();

        meal.setDish("hej");

//        entityManager.
        entityManager.merge(meal);

        return "gym/welcomeTobi";
    }

    public String test2()
    {
        return "gym/registerTobi/logIn";
    }

}
