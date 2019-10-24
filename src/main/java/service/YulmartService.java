package service;

import comparator.ProductByNameComparator;
import model.ExerciseBike;
import model.Product;
import model.Smartphone;
import model.TV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class YulmartService {
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
        result.sort(new ProductByNameComparator());
        return result;
    }
    public List<Product> searchByCategory(String category){
        List<Product> result = new ArrayList<>();
        for (Product item : items) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }
        result.sort(new ProductByNameComparator());
        return result;
    }
    public  List<Product> sortByName(){
        List<Product> result = new ArrayList<>(items);
        result.sort(new ProductByNameComparator());
        return result;
    }
    public  List<Product> sortByRating(){
        List<Product> result = new ArrayList<>(items);
        result.sort(new ProductByNameComparator());
        return result;
    }
    public  List<Product> sortByPrice(){
        List<Product> result = new ArrayList<>(items);
        result.sort(new ProductByNameComparator());
        return result;
    }


}
