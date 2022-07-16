package pl.coderslab.model;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDao {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getList(List<Product> productList) {

//        Product milk = new Product("Milk", 4.20, 100100L);
//        Product bread = new Product("Bread", 4.50, 100200L);
//        Product water = new Product("Water", 1.90, 100300L);

//        productList.add(milk);
//        productList.add(bread);
//        productList.add(water);

        return productList;
    }
}
