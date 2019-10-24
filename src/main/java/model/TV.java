package model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TV extends Product {
    private int Diagonal;
    private String HdFormat;
    private String Wifi;

    public TV(long id, String name, String category, int price, int rating, int diagonal, String hdFormat, String wifi) {
        super(id, name, category, price, rating);
        Diagonal = diagonal;
        HdFormat = hdFormat;
        Wifi = wifi;
    }
}
