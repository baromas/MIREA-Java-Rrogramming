package com.company;

public class Test {
    public static void main(String[] args) {
        Shepherd example1 = new Shepherd("Немецкая овчарка", 11, 35, 1955);
        Husky example2 = new Husky("Хаски", 13, 20, 1966);
        example2.displayInfo();
        System.out.println();
        example1.displayInfo();
    }
}
