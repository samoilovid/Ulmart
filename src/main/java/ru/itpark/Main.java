package ru.itpark;

import ru.itpark.model.ExerciseBike;
import ru.itpark.model.Product;
import ru.itpark.model.Smartphone;
import ru.itpark.model.TV;
import ru.itpark.service.UlmartService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UlmartService service = new UlmartService();
        service.add(new Smartphone(4496663, "Redmi Note 7","Smartphone", 13_990, 4, 2, "blue", 3 ));
        service.add(new Smartphone(4574121, "Redmi 7A", "Smartphone", 7_990, 0, 2, "black",2));
        service.add(new TV(4509006, "Витязь 43LF0207", "TV", 12_990, 5, 43, "1080p (Full HD)", "Нет"));
        service.add(new TV(4465697, "Prestigio 32” Grace 1", "TV", 9_890, 5, 32, "720p (HD)", "Встроенный"));
        service.add(new ExerciseBike(4528670, "Bradex", "ExerciseBike", 4_589, 5, "Ременная", "Нет"));
        service.add(new ExerciseBike(4461544, "Freemotion TOUR DE FRANCE CLUB", "ExerciseBike", 390_990, 0, "Магнитная", "Есть"));

        List<Product> print = service.searchByCategory("Smartphone");
        System.out.println(print);
    }
}
