package com.ing.zoo;

import java.util.Random;

public class Tiger implements Animal, Carnivore{
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String sayHello()
    {
        return "rraaarww";
    }

    public String eatMeat()
    {
        return "nomnomnom oink wubalubadubdub";
    }

    public String performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
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
