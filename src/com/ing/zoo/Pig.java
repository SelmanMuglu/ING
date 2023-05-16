package com.ing.zoo;

import java.util.Random;

public class Pig implements Animal, Carnivore, Herbivore{
    private String name;

    public Pig(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public String sayHello()
    {
        return "splash";
    }

    public String eatLeaves()
    {
        return "munch munch oink";
    }

    public String eatMeat()
    {
        return "nomnomnom oink thx";

    }

    public String performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        return trick;
    }
}
