package dev.lpa;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args){

        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by JFK, produced in 1950"));

        storeProducts.add(new ArtObject("Sculpture", 2000,
                            "Bronze work by JFK, produced in 1950"));

        listProducts();

    }

    public static void listProducts(){

        for (var item: storeProducts ){
            System.out.println("-" .repeat(30));
            item.showDetails();
        }
    }
}
