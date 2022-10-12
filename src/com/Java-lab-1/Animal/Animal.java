package com.Java-lab-1.Animal;

public class Animal {

    private String AnimalName;
    private int Height;
    private int Weight;
    private String AnimalType;
    private String BloodType;

    // parameterized constructor
    public Animal(String AnimalName, int Height, int Weight, String AnimalType, String BloodType) {
        this.AnimalName = AnimalName;
        this.Height = Height;
        this.Weight = Weight;
        this.AnimalType = AnimalType;
        this.BloodType = BloodType;
    }

    // getters and setters
    public String getAnimalName() {
        return this.AnimalName;
    }

    public void setAnimalName(String AnimalName) {
        this.AnimalName = AnimalName;
    }

    public int getHeight() {
        return this.Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public int getWeight() {
        return this.Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public String getAnimalType() {
        return this.AnimalType;
    }

    public void setAnimalType(String AnimalType) {
        this.AnimalType = AnimalType;
    }

    public String getBloodType() {
        return this.BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    // default constructor
    public Animal(){
    }

}
