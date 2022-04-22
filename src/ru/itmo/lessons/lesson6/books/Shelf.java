package ru.itmo.lessons.lesson6.books;

public class Shelf {
    private String color = "Белый";
    public Book[] books = new Book[10];
    //метод добавления одной книги в массив
    public void addBook(Book book){
        for (int i = 0 ; i < books.length; i+=1){
            if (books[i]==null){
                books[i]=book;
                return;
            }
        }
          System.out.println("Нет места");
    }
    //метод добавленя нескольких книг на полку
    public void addBook(Book...books){

    }
}
