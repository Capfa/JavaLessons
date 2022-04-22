package ru.itmo.lessons.lesson11.enums;

public enum Planet {
    MARS(100,200),EARTH(50,100);
    private int weight;
    private int radius;

    Planet(int radius,int weight) {
        this.radius=radius;
        this.weight=weight;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getRadius() {
        return radius;
    }
}
