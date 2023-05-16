package com.ing.zoo;

import java.util.Random;

public class Zebra implements Animal, Herbivore{
    private String name;

    public Zebra(String name) {
        this.name = name;

    }

    public String sayHello()
    {
        return "zebra zebra";

    }

    public String eatLeaves()
    {
        return "munch munch zank yee bra";
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
            trick = "gallops";
        }
        else
        {
            trick = "trots";
        }
        return trick;
    }
}
