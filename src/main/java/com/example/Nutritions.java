package com.example;

/**
 * Пищевая ценность продукта (белки, жиры, углеводы) в граммах на 100 г.
 */
public class Nutritions {
    private final double proteins;
    private final double fats;
    private final double carbs;

    public Nutritions(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }

    public double getProteins() { return proteins; }
    public double getFats()     { return fats; }
    public double getCarbs()    { return carbs; }

    /** Энергетическая ценность: 4 ккал/г белка, 9 ккал/г жира, 4 ккал/г углеводов. */
    public double calories() {
        return proteins * 4 + fats * 9 + carbs * 4;
    }

    @Override
    public String toString() {
        return String.format("Б=%.1f Ж=%.1f У=%.1f (%.1f ккал)",
                proteins, fats, carbs, calories());
    }
}