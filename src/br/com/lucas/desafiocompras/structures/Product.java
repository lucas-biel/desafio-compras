package br.com.lucas.desafiocompras.structures;

public class Product implements Comparable<Product> {

    private String description;
    private double price;

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "%s - R$%.2f".formatted(this.getDescription(), this.getPrice());
    }

    @Override
    public int compareTo(Product o) {
        // return Double.valueOf(this.price).compareTo(Double.valueOf(o.price));

        // return Double.valueOf(this.price).compareTo(o.price); // forma reduzida

        return Double.compare(this.price, o.price);  // jeito mais simples de fazer
    }
}
