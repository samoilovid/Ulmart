package comparator;

import model.Product;

import java.util.Comparator;

public class ProductBayAssessmentComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getRating()-o2.getRating());
    }
}
