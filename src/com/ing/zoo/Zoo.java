package com.ing.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
//        String[] commands = new String[4];
//        commands[0] = "hello";
//        commands[1] = "give leaves";
//        commands[2] = "give meat";
//        commands[3] = "perform trick";

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));
        // Two extra classes
        animals.add(new Dog("tom"));
        animals.add(new Snake("sissy"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        switch (input) {
            case "hello":
                for (Animal animal : animals) {
                    System.out.println(animal.sayHello());
                }
                break;
            case "give leaves":
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        System.out.println(animal.getName() + " eats " + ((Herbivore) animal).eatLeaves());
                    }
                }
                break;
            case "give meat":
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        System.out.println(animal.getName() + " eats " + ((Carnivore) animal).eatMeat());
                    }
                }
                break;
            case "perform trick":
                for (Animal animal : animals) {
                    System.out.println(animal.performTrick());
                }
                break;
            default:
                boolean found = false;
                for (Animal animal : animals) {
                    if (input.equals("hello " + animal.getName())) {
                        System.out.println(animal.sayHello());
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Unknown command: " + input);
                }
                break;
        }
    }
}
