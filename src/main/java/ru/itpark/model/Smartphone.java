package ru.itpark.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Smartphone extends Product {
private int SimCardNumber;
private String color;

    public Smartphone(long id, String name, String category, int price, int rating, int simCardNumber, String color, int ramSize) {
        super(id, name, category, price, rating);
        SimCardNumber = simCardNumber;
        this.color = color;
        RamSize = ramSize;
    }

    private int RamSize;
}
