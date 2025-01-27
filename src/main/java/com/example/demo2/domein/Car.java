package com.example.demo2.domein;

public class Car {
    private int speed;
    private String name;
    private int gas;


    public Car(int speed, String name,int gas) {
        this.speed = speed;
        this.name = name;
        this.gas= gas;
    }
    
    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public Car() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    


    



}
