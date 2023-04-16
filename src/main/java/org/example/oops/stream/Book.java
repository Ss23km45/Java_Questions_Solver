package org.example.oops.stream;

public final class Book {
    private int count;
    private String name;
    private double price;

    public Book(int count, String name, double price) {
        this.count = count;
        this.name = name;
        this.price = price;
    }

    public Book() {

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
