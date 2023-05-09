package com.ing.zoo;

import java.util.Random;

public class Zebra implements Animal, Herbivore{
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Zebra(String name) {
        this.name = name;
        this.helloText = sayHello();
        this.eatText = eatLeaves();
        this.trick = performTrick();
    }

    public String sayHello()
    {
        helloText = "zebra zebra";
        return helloText;
    }

    public String eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        return eatText;
    }

    public Zebra(String name, String helloText, String eatText) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
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
            trick = "gallops";
        }
        else
        {
            trick = "trots";
        }
        return trick;
    }
}
