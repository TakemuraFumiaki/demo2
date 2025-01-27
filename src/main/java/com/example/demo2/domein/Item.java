package com.example.demo2.domein;

public class Item {

    private String name;
    private int price;
    private String color;


    
    public Item(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + ", color=" + color + "]";
    }

    

    

}
