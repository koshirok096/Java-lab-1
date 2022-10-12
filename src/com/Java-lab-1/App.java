package com.Java-lab-1;

import com.Java-lab-1.Birds.Birds;
import com.Java-lab-1.Fish.Fish;
import com.Java-lab-1.Reptile.Reptile;

public class App {
    public static void main(String[] args) throws Exception {

        // create a Birds object
        Birds Birds = new Birds("turkey", 2, 1, "Birds", "A or B or C or D or E or F or G or H or I or J or K or L or M or N or O or P or Q or R or S or T or U or W", "Animals with feathers", "Can Fly");

        // create a Fish object
        Fish Fish = new Fish("mackerel", 4, 5, "Fish", "A", "String Live in water", "String Has gills");

        // create a Reptile object
        Reptile Reptile = new Reptile("gecko", 6, 3, "A or B or AB", "Dry Skin", "Backbone", "Soft-shelled eggs");

        System.out.println("====================");
        // print the Birds object
        System.out.println(Birds.getAnimalName());
        System.out.println(Birds.getAnimalType());
        System.out.println(Birds.getHandle());

        System.out.println("====================");
        // print the Fish object
        System.out.println(Fish.getAnimalName());
        System.out.println(Fish.getAnimalType());
        System.out.println(Fish.getSteering());

        System.out.println("====================");
        // print the Reptile object
        System.out.println(Reptile.getAnimalName());
        System.out.println(Reptile.getAnimalType());
        System.out.println(Reptile.getContainer());
        
    }
}
