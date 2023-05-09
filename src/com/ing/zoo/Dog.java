package com.ing.zoo;

import java.util.Random;

public class Dog implements Animal, Carnivore {

    private String name;
    private String helloText;
    private String eatText;
    private String trick;


    public Dog(String name) {
        this.name = name;
        this.helloText = sayHello();
        this.eatText = eatMeat();
        this.trick = performTrick();
    }

    public String sayHello()
    {
        helloText = "wooooof woof";
        return helloText;
    }

    public String eatMeat()
    {
        eatText = "yum yummmm";
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
            trick = "jumps through hoop";
        }
        else
        {
            trick = "runs in circles";
        }
        return trick;
    }

}
