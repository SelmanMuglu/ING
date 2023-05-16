package com.ing.zoo;

import java.util.Random;

public class Dog implements Animal, Carnivore {

    private final String name;


    public Dog(String name) {
        this.name = name;

    }

    public String sayHello()
    {
        return "wooooof woof";
    }

    public String eatMeat()
    {
        return "yum yummmm";
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
            trick = "jumps through hoop";
        }
        else
        {
            trick = "runs in circles";
        }
        return trick;
    }

}
