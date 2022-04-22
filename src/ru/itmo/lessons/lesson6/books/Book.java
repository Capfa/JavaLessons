package ru.itmo.lessons.lesson6.books;

import java.util.Objects;

public class Book {
    private String title;// privat-доступ только из класса
    private int pageCount;
    private Author author;

    public Book(){};//1 вариант конструктора

    public Book(Author author) {//2 вариант конструктора
       this.author = author;
    }

    public Book(String title, Author author) {//3 вариант конструктора
        Objects.requireNonNull(author,"не может быть null");
        this.author = author;
        setTitle(title);
    }

   // public Book(String title, Author author) {//2 вариант конструктора
           //вызвать другой конструктор
    //    this(author);
    //   setTitle(title);
   // }


    //методы,позволяющие установить значения свойств со всеми необходимыми проверками-сеттеры
    public void setTitle(String titleValue){
        if (titleValue==null|| titleValue.length()<3){
            throw new IllegalArgumentException("Значение title от трех символов");

        }
        title = titleValue;

    }
    //методы, которые возвращают значения свойств -геттеры
    public  String getTitle(){
        return title;
    }
    public void setPageCount(int pageCount){
        if (pageCount<10){
            throw new IllegalArgumentException("Значение pageCount дб больше 10 ");
        }
        //this-ссылка на текущий обьект
        this.pageCount=pageCount;
    }

}
