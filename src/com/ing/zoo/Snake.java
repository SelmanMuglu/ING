package com.ing.zoo;

import java.util.Random;

public class Snake implements Animal, Carnivore{

    private String name;


    public Snake(String name) {
        this.name = name;
    }

    public String sayHello()
    {
        return "sssshelo sss";
    }

    public String eatMeat()
    {
        return "ssss thx";
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
            trick = "climbs tree";
        }
        else
        {
            trick = "catches bird";
        }
        return trick;
    }
}
