package com.company;

import java.util.Arrays;

class library{
    String [] books;
    int noOfBooks;

    library (){
        this.books = new String[50];
        this.noOfBooks = 0;
    }

    void addBook(String b){
        this.books [noOfBooks]= b;
        noOfBooks++;
        System.out.println(b + " book has been added in the library");
    }

    void availableBooks(){
        System.out.println("List of books has been available in the library");
        for (int i=0; i<books.length; i++){
            if (books[i]==null){
                continue;
            }
            System.out.println(books[i]);
        }
    }

    void issueBooks(String b){
        for (int i=0; i<this.books.length; i++){
            if (this.books[i].equals(b)){
                this.books[i]=null;
                System.out.println(b + " book has been issued by you");
                break;
            }
        }
    }

    void returnBooks(String b){
        addBook(b);
        System.out.println(b + " book has been returned");
    }
}

public class Ex04_Libraries {
    public static void main(String[] args) {
        library l = new library();
        l.addBook("C++");
        l.addBook("Java");
        l.addBook("C");
        l.availableBooks();
        l.issueBooks("Java");
        l.availableBooks();
        l.returnBooks("Java");
        l.availableBooks();



    }
}
