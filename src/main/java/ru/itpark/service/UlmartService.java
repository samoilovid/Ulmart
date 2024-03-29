package ru.itpark.service;

import ru.itpark.comparator.ProductByNameAscComparator;
import ru.itpark.comparator.SearchByRatingDescComparator;
import ru.itpark.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UlmartService {
    private final Collection<Product>items = new ArrayList<>();

    public void add(Product item){
        items.add(item);
    }
    public void addAll(Product... items){
        Collections.addAll(this.items, items);
    }
    public void addAll(Collection<Product> items){
        this.items.addAll(items);
    }

    public List<Product> searchByName(String name){
        List<Product> result = new ArrayList<>();
        for (Product item : items) {
            if (item.getName().startsWith(name)){
                result.add(item);
            }
        }
        result.sort(new ProductByNameAscComparator());
        return result;
    }
    public List<Product> searchByCategory(String category){
        List<Product> result = new ArrayList<>();
        for (Product item : items) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }
        result.sort(new ProductByNameAscComparator());
        return result;
    }
    public  List<Product> sortByName(){
        List<Product> result = new ArrayList<>(items);
        result.sort(new ProductByNameAscComparator());
        return result;
    }
    public  List<Product> sortByRating(){
        List<Product> result = new ArrayList<>(items);
        result.sort(new SearchByRatingDescComparator());
        return result;
    }
    public  List<Product> sortByPrice(){
        List<Product> result = new ArrayList<>(items);
        Collections.sort(result);
        return result;
    }


}
