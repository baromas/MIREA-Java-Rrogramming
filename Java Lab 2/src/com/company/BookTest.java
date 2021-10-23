package com.company;

public class BookTest {

    public static void main(String[] args) {
        Book example1 = new Book();
        example1.setName("1984");
        example1.setAuthor("George Orwell");
        example1.print_info();

        System.out.println();
        example1.getDate_of_issue();

        Book example2 = new Book("It", "Stephen King");
        example2.setDate_of_issue(1986);
        example2.print_info();
    }
}
