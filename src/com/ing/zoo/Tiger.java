package com.ing.zoo;

import java.util.Random;

public class Tiger implements Animal, Carnivore{
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger(String name) {
        this.name = name;
        this.helloText = sayHello();
        this.eatText = eatMeat();
        this.trick = performTrick();
    }

    @Override
    public String getName() {
        return name;
    }

    public String sayHello()
    {
        helloText = "rraaarww";
        return helloText;
    }

    public String eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        return eatText;
    }

    public String performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        return trick;
    }
}
