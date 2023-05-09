package com.ing.zoo;

import java.util.Random;

public class Hippo implements Animal, Herbivore{
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Hippo(String name) {
        this.name = name;
        this.helloText = sayHello();
        this.eatText = eatLeaves();
        this.trick = performTrick();
    }

    public String sayHello()
    {
        helloText = "splash";
        return helloText;
    }

    public String eatLeaves()
    {
        eatText = "munch munch lovely";
        return eatText;
    }

    public String getName() {
        return name;
    }

    public String performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
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
