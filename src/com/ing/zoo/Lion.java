package com.ing.zoo;

import java.util.Random;

public class Lion implements Animal, Carnivore{
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sayHello()
    {
        return "roooaoaaaaar";
    }

    public String eatMeat()
    {
        return "nomnomnom thx mate";
    }

    public String performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;
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
