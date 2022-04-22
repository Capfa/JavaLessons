package ru.itmo.lessons.lesson6.books;

public class Author {
    //свойства
    public String name;//public-модификатор доступаюпозволяет обратиться к свойству из любой точки программы
    public String surname;
    //методы
    public  void printFullName(){    //void указывает,что метод ничего не возвращает. можно использовать в таком методе  return,но только чтоб прервать выполнение метода
        System.out.println(name+" "+surname);

    }
    public String getFullName(){// если метод возвращает какой то обьект, в обьявлении сразу указывается его тип
        return name + " " + surname;//возвращает результат работы метода. прерывает работу метода


    }


}
