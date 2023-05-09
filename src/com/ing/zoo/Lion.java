package com.ing.zoo;

import java.util.Random;

public class Lion implements Animal, Carnivore{
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Lion(String name) {
        this.name = name;
        this.helloText = sayHello();
        this.eatText = eatMeat();
        this.trick = performTrick();
    }

    public String getName() {
        return name;
    }

    public String sayHello()
    {
        helloText = "roooaoaaaaar";
        return helloText;
    }

    public String eatMeat()
    {
        eatText = "nomnomnom thx mate";
        return eatText;
    }

    public String performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps very high";
        }
        else
        {
            trick = "roars";
        }
        return trick;
    }


}
