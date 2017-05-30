package com.hfad.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
        new Workout("Coffee",
                    "Cappuccino\nLatte\nAmericano"),
        new Workout("Tea",
                    "Earl Grey\nEnglish Breakfast\nOolong Tea\nGreen Tea"),
        new Workout("Cold Beverages",
                    "Orange Juice\nCoke\nIca Lemon Tea"),
        new Workout("Dessert",
                    "Chocolate Cake\nNew York Cheese Cake\nStrawberry Short Cake")
    };

    //Each Workout has a name and description
    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
