package com.Java-lab-1.Fish;

import com.Java-lab-1.Animal.Animal;

public class Fish extends Animal{

    private String fOne;
    private String fTwo;

    // default constructor
    public Fish(){
    }

    // parameterized constructor
    public Fish(String AnimalName, int Height, int Weight, String AnimalType, String BloodType, String fOne, String fTwo) {
        super(AnimalName, Height, Weight, AnimalType, BloodType);
        this.fOne = fOne;
        this.fTwo = fTwo;
    }

    public Fish(String fOne, String fTwo, String seatBelt, boolean AC) {
        this.fOne = fOne;
        this.fTwo = fTwo;
    }

    // getters and setters

    public String getfOne() {
        return this.fOne;
    }

    public void setfOne(String fOne) {
        this.fOne = fOne;
    }

    public String getfTwo() {
        return this.fTwo;
    }

    public void setfTwo(String fTwo) {
        this.fTwo = fTwo;
    }
    
}
