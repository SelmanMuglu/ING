package com.ing.zoo;

import java.util.Random;

public class Snake implements Animal, Carnivore{

    private String name;
    private String helloText;
    private String eatText;
    private String trick;


    public Snake(String name) {
        this.name = name;
        this.helloText = sayHello();
        this.eatText = eatMeat();
        this.trick = performTrick();
    }

    public String sayHello()
    {
        helloText = "sssshelo sss";
        return helloText;
    }

    public String eatMeat()
    {
        eatText = "ssss thx";
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
            trick = "climbs tree";
        }
        else
        {
            trick = "catches bird";
        }
        return trick;
    }
}
