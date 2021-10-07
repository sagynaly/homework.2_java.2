package com.company;

public class Goat extends Animal{
    private String thisFrog = " коза белый";
    public Goat(String name, int age) {
        super(name, age);

    }
    @Override
    public void print() {
        peculiarity = " у " + getName() + " рост 120 см";
        System.out.println("Зовут коза " + getName() + "\n возраст коза " + getAge() + " лет"+ "\n" + peculiarity +
                "\n"+ thisFrog + "\n----------------------------------------------------");


    }
            }