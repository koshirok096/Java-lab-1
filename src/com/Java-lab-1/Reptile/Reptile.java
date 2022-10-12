package com.Java-lab-1.Reptile;

import com.Java-lab-1.Animal.Animal;

public class Reptile extends Animal{

    private String rOne;
    private String rTwo;
    private String rThree;
    private String container;

    // default constructor
    public Reptile(){
    }

    // parameterized constructor
    public Reptile(String AnimalName, int Height, int Weight, String AnimalType, String BloodType, String rOne, String rTwo, String rThree, String container) {
        super(AnimalName, Height, Weight, AnimalType, BloodType);
        this.rOne = rOne;
        this.rTwo = rTwo;
        this.rThree = rThree;
        this.container = container;
    }

    public Reptile (String rOne, String rTwo, String rThree, String container) {
        this.rOne = rOne;
        this.rTwo = rTwo;
        this.rThree = rThree;
        this.container = container;
    }

    // getters and setters

    public String getrOne() {
        return this.rOne;
    }

    public void setrOne(String rOne) {
        this.rOne = rOne;
    }

    public String getrTwo() {
        return this.rTwo;
    }

    public void setrTwo(String rTwo) {
        this.rTwo = rTwo;
    }

    public String getrThree() {
        return this.rThree;
    }

    public void setrThree(String rThree) {
        this.rThree = rThree;
    }

    public String getContainer() {
        return this.container;
    }

    public void setContainer(String container) {
        this.container = container;
    }
    
}
