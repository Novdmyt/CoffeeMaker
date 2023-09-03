package app.CoffeeMachine;

import app.drinks.Cappuccino;
import app.drinks.Drinks;
import app.drinks.Espresso;
import app.drinks.Latte;

import java.util.Scanner;

public class CoffeeMachine {
    public void getMenu() {
        System.out.println(""" 
                Choose a drink:
                1 - Espresso
                2 - Cappuccino
                3 - Latte""");
        Drinks drink = new Drinks();
        Scanner scanner = new Scanner(System.in);
        int number ;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 1 && number <= 3) {
                    break;
                } else {
                    System.out.println("Please enter a valid number (1, 2, or 3).");
                }
            } else {
                scanner.next();
                System.out.println("Please enter a valid number (1, 2, or 3).");
            }
        }

        switch (number) {
            case 1 -> {
                drink.setDrink(new Espresso());
                drink.startDrink();
            }
            case 2 -> {
                drink.setDrink(new Cappuccino());
                drink.startDrink();
            }
            case 3 -> {
                drink.setDrink(new Latte());
                drink.startDrink();
            }
            default -> {
            }
        }

    }
}
