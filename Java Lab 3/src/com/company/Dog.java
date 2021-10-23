package com.company;

public abstract class Dog {

    private String name;
    private int lifespan;
    private int weight;

    public int getLifespan() { return lifespan; }
    public int getWeight() { return weight; }
    public String getName() { return name; }

    public Dog(String name, int lifespan, int weight){
        this.name=name;
        this.lifespan=lifespan;
        this.weight=weight;
    }
public abstract void displayInfo();
}
class Shepherd extends Dog{
    private int year_of_breed;
    public int getYear_of_breed() { return year_of_breed; }

    public Shepherd(String name, int lifespan, int weight, int year_of_breed) {

        super(name, lifespan, weight);
        this.year_of_breed = year_of_breed;
    }

    public void displayInfo(){

        System.out.println("Порода: " + super.getName() +"\nСредняя продолжительность жизни: " + super.getLifespan() + "\nВес (кг): " + super.getWeight() + "\nГод выведения породы: " + year_of_breed);
    }
}
class Husky extends Dog {
    private int year_of_breed;

    public int getYear_of_breed() {
        return year_of_breed;
    }

    public Husky(String name, int lifespan, int weight, int year_of_breed) {

        super(name, lifespan, weight);
        this.year_of_breed = year_of_breed;
    }

    public void displayInfo() {

        System.out.println("Порода: " + super.getName() + "\nСредняя продолжительность жизни: " + super.getLifespan() + "\nВес (кг): " + super.getWeight() + "\nГод выведения породы: " + year_of_breed);
    }
}



