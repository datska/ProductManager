package ru.netology.manager;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String name, int cost, String manufacturer) {
        super(id, name, cost);
        this.manufacturer = manufacturer;
    }
}

