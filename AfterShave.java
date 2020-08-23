package be.intecbrussel.MerkProducten;

public class AfterShave extends Product{

    public enum Sort{
        VAPO, GEL;

        Sort sort;
    }

    public AfterShave(int productNumber, String brand, String name, int volume, double price, Sort vapo) {
        super(productNumber, brand, name, volume, price);
    }
}
