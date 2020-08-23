package be.intecbrussel.MerkProducten;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Bestelling implements Berekenbaar {

        private static int PRODUCT_NUMBER = 1000;
        private List<Product> bestelling;

    public Bestelling(){}

    public Bestelling(List<Product> bestelling) {
        this.bestelling = bestelling;
    }

    public List<Product> voegProductToe(Product artikel){
        if (artikel != null) {
            bestelling.add(artikel);
        }
        return bestelling;
    }


    public List<Product> sorteerOpMerk(){
        bestelling.sort((a,b)->a.getBrand().compareTo(b.getBrand()));
        return bestelling;
    }


    @Override
    public double totalePrijs() {

        return bestelling.stream().mapToDouble(Product::getPrice).sum();
    }


}

