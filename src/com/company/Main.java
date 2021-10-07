package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] arrayAnimal ={createObject("Dog"),createObject("Frog"),createObject("Cat")};
        for (Animal f:arrayAnimal) {
            f.print();

        }

    }

    public static Animal createObject(String className){
        switch (className){
            case "Dog":
                Dog dog = new Dog("Sharic",12);
                return dog;
            case "Frog":
                Goat goat = new Goat("tom",5);
                return goat;
            case "Cat":
                Cat cat = new Cat("Cimba",17);
                return cat;
        }
        return null;
    }

}

