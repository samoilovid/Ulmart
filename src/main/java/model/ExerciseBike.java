package model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseBike extends Product {
    private String LoadSystem;
    private String HeartRateMeasurement;

    public ExerciseBike(long id, String name, String category, int price, int rating, String loadSystem, String heartRateMeasurement) {
        super(id, name, category, price, rating);
        LoadSystem = loadSystem;
        HeartRateMeasurement = heartRateMeasurement;
    }
}
