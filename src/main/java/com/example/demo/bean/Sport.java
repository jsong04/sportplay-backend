package com.example.demo.bean;

public class Sport {
    private int id;
    private String name;
    private int length;
    private int calories;

    public Sport(String name, int length, int calories) {
        this.name = name;
        this.length = length;
        this.calories = calories;
    }

    public Sport(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", calories=" + calories +
                '}';
    }
}
