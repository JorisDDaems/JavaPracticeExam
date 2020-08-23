package be.intecbrussel.MerkProducten;

public class Deodorant extends Product {

    public enum DeoType{
        VAPO, STICK;

        DeoType sort;
    }

    public Deodorant(int productNumber, String brand, String name, int volume, double price, DeoType stick) {
        super(productNumber, brand, name, volume, price);
    }
}
