package com.Java-lab-1.Birds;

import com.Java-lab-1.Animal.Animal;

public class Birds extends Animal {
    private String bOne;
    private String bTwo;


    // default constructor
    public Birds(){
    }

    // parameterized constructor
    public Birds(String AnimalName, int Height, int Weight, String AnimalType, String BloodType, String bOne, String bTwo) {
        super(AnimalName, Height, Weight, AnimalType, BloodType);
        this.bOne = bOne;
        this.bTwo = bTwo;
    }

    public Birds(String bOne, String bTwo) {
        this.bOne = bOne;
        this.bTwo = bTwo;
    }

    // getters and setters
    public String getbOne() {
        return this.bOne;
    }

    public void setbOne(String bOne) {
        this.bOne = bOne;
    }

    public String getbTwo() {
        return this.bTwo;
    }

    public void setbTwo(String bTwo) {
        this.bTwo = bTwo;
    }


}
