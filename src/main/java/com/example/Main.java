package com.example;

import java.util.ArrayList;
import java.util.List;

/** Демонстрация иерархии Food. */
public class Main {
    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();

        
        foods.add(new Fruit("Яблоко",      true,  new Nutritions(0.4, 0.4, 9.8)));
        foods.add(new Fruit("Банан",       true,  new Nutritions(1.5, 0.2, 21.8)));
        foods.add(new Fruit("Арбуз",       true,  new Nutritions(0.6, 0.1, 5.8)));
        foods.add(new Fruit("Помидор",     true,  new Nutritions(1.1, 0.2, 3.7))); // ботанически фрукт
        foods.add(new Vegetable("Морковь", true,  new Nutritions(0.9, 0.2, 6.5)));
        foods.add(new Vegetable("Огурец",  true,  new Nutritions(0.8, 0.1, 2.5)));
        foods.add(new Vegetable("Лук",     true,  new Nutritions(1.4, 0.0, 10.4)));
        foods.add(new Meat("Говядина",     true,  new Nutritions(26.0, 16.0, 0.0)));
        foods.add(new Meat("Курица",       true,  new Nutritions(25.0, 7.0, 0.0)));
        foods.add(new Meat("Свинина",      true,  new Nutritions(20.0, 30.0, 0.0)));
        foods.add(new Food("Поганка",      false, new Nutritions(2.0, 0.5, 3.0)) {
            
        });

        
        double limit = 60.0;
        System.out.println("Съедобные фрукты и овощи с калорийностью < " + limit + ":");
        for (Food f : foods) {
            if ((f instanceof Fruit || f instanceof Vegetable) && f.isEdible() && f.energyValue() < limit) {
                System.out.printf("  %s  -> %.2f ккал%n", f, f.energyValue());
            }
        }

        
        char letter = 'а';
        System.out.println("\nЕда, название которой заканчивается на '" + letter + "':");
        for (Food f : foods) {
            if (f.getName().toLowerCase().endsWith(String.valueOf(letter))) {
                System.out.println("  " + f);
            }
        }
    }
}