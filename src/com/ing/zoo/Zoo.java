package com.ing.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

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

        // if else checks which command has been filled in, to respond accordingly to the command
        if (input.equals(commands[0])) {
            // Print hello text for all animals
            for (Animal animal : animals) {
                System.out.println(animal.sayHello());
            }
        } else if (input.equals(commands[1])) {
            for (Animal animal : animals) {
                if (animal instanceof Herbivore) {
                    System.out.println(animal.getName() + " eats " + ((Herbivore) animal).eatLeaves());
                }
            }
            
        }else if (input.equals(commands[2])) {
            for (Animal animal : animals) {
                if (animal instanceof Carnivore) {
                    System.out.println(animal.getName() + " eats " + ((Carnivore) animal).eatMeat());
                }
            }
        } else if(input.equals(commands[3])){
            for (Animal animal : animals){
                System.out.println(animal.performTrick());
            }
        }
            else {
            // Check if the input matches the name of any animal
            boolean found = false;
            for (Animal animal : animals) {
                if (input.equals(commands[0] + " " + animal.getName())) {
                    System.out.println(animal.sayHello());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}
