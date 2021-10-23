package com.company;

public class Book {
    private String name;
    private String author;
    private int date_of_issue;

    public Book (){

    }
    public Book (String name){
        this.name = name;
    }
    public Book (String name, String author){
        this.name = name;
        this.author = author;
    }
    public Book (int date_of_issue){
        this.date_of_issue = date_of_issue;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){

        this.author = author;
    }
    public void setDate_of_issue(int date_of_issue){
        this.date_of_issue = date_of_issue;
    }

    public void getName(){
        if (name != null)
            System.out.println('"' + name +'"');
    }
    public void getAuthor(){

        if (author != null)
            System.out.println(author);
    }
    public void getDate_of_issue(){
        if (date_of_issue != 0)
            System.out.println(date_of_issue);
    }

    public void print_info(){
        if (name != null)
        System.out.println('"' + name +'"');
        if (author != null)
            System.out.println(author);
        if (date_of_issue != 0)
            System.out.println(date_of_issue);
    }
}
