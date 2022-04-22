package ru.itmo.lessons.lesson6;

import ru.itmo.lessons.lesson6.books.Author;
import ru.itmo.lessons.lesson6.books.Book;
import ru.itmo.lessons.lesson6.books.Shelf;

//полное имя классаЖимя пакета +имя класса :ru.itmo.lessons.lesson6.Application
public class Application {
    public static void main(String[] args) {
        //класс - способ описания сущностиб определяющий  еесостояние и поведение
        //класс-набор свойств и методов будущих обьектов
        //на основе класса создаются обьекты(экземпляры класса)
        Author author1 = new Author();
        Author author2 = new Author();
        //обращение к  свойствам класса
        author1.name= "Tom";
        author1.surname= "Crowed";
        author2.name= "Mike";
        author2.surname= "Thompson";
        author1.printFullName();
        author2.printFullName();
        author1.getFullName();
        String fullName = author1.getFullName();
        System.out.println(fullName);
        Book book1 = new Book();//вызов конструктора
        book1.setTitle("Книга");//от 3х символов
        System.out.println(book1.getTitle());
        book1.setPageCount(22);

        Shelf shelf = new Shelf();
        shelf.addBook(book1);
        shelf.addBook(book1,book1,book1);//аргументы передаются в массив,ссылка на массив передается локальной переменной books

        //System.out.println(shelf.books[0].author.name);
    }
}
