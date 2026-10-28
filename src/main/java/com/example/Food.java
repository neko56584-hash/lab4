package com.example;

/**
 * Абстрактная еда: общие поля (название, съедобность, БЖУ) и метод расчёта калорийности.
 */
public abstract class Food {
    private final String name;
    private final boolean edible;
    private final Nutritions nutritions;

    protected Food(String name, boolean edible, Nutritions nutritions) {
        this.name = name;
        this.edible = edible;
        this.nutritions = nutritions;
    }

    public String getName()         { return name; }
    public boolean isEdible()       { return edible; }
    public Nutritions getNutritions() { return nutritions; }

    /** Расчёт энергетической ценности (пункт 2 задания). */
    public double energyValue() {
        return nutritions.calories();
    }

    @Override
    public String toString() {
        return String.format("%s [%s, съедобное=%b, %s]",
                getClass().getSimpleName(), name, edible, nutritions);
    }
}