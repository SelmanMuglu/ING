package com.ing.zoo;

import java.util.Random;

public class Hippo implements Animal, Herbivore{

    private final String name;

    public Hippo(String name) {
        this.name = name;
    }

    public String sayHello()
    {
        return "splash";
    }

    public String eatLeaves()
    {
        return "munch munch lovely";
    }

    public String getName() {
        return name;
    }

    public String performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
        if(rnd == 0)
        {
            trick = "eats watermelon in one bite";
        }
        else
        {
            trick = "opens mouth";
        }
        return trick;
    }
}
