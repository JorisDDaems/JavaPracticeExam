package be.intecbrussel.MerkProducten;

import java.util.Comparator;

public abstract class Product {
    private int productNumber;
    private String brand;
    private String name;
    private int volume;
    private double price;

    public Product(int productNumber, String brand, String name, int volume, double price) {
        this.productNumber = productNumber;
        this.brand = brand;
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode(){

        return getBrand().substring(0,2) + getName().substring(0,2) + getVolume();
    }

    public static Comparator<Product> sortByBrand(){

        return Comparator.comparing(Product::getBrand);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
