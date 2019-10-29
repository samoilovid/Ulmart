package ru.itpark.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product implements Comparable<Product> {
    private long id;
    private String name;
    private String category;
    private int price;
    private int rating;

    public int compareTo(Product o) {
        return price - o.price;
    }
}

