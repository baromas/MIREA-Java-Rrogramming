package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 1)
            System.out.println("Ошибка! Неправильное число.");
        else{
        int i = 1;
        int factorial = 1;
        do { factorial *= i;
            i++;
        } while (i <= number);
        System.out.println(factorial);
        }
    }
}
