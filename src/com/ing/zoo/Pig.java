package com.ing.zoo;

import java.util.Random;

public class Pig implements Animal, Carnivore, Herbivore{
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Pig(String name) {
        this.name = name;
        this.helloText = sayHello();
        this.eatText = eatLeaves();
        this.trick = performTrick();
    }

    public String getName(){
        return name;
    }


    public String sayHello()
    {
        helloText = "splash";
        return helloText;
    }

    public String eatLeaves()
    {
        eatText = "munch munch oink";
        return eatText;
    }

    public String eatMeat()
    {
        eatText = "nomnomnom oink thx";
        return eatText;
    }

    public String performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
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
