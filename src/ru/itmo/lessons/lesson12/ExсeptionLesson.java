package ru.itmo.lessons.lesson12;

import java.io.IOException;

public class ExсeptionLesson {
    public static void main(String[] args) {
        //Error- ошибки ,связанные с проблемами уровня виртуальной машины
        //например нехватка памяти
        //обрабатывать нет смысла

        //Exception-исключени
        //1.Исключения времени выполнения(наследники RuntimeExсeption)
        //unchecked, необрабатываемые,неотслеживаемые,неконтролируемые
        //разработчики могут по своему усмотрению обработать данный тип исключений.не обязательно
        //2.Исключения времени компеляции(все остальные наследники  Exсeption)
        //checked, обрабатываемые,отслеживаемые,контролируемые
        //обязательно обрабатываются!!!


        //RuntimeException
        int a = 1;
        int b = 0;
        int res;
        // res=a/b;   java.lang.ArithmeticException

        int[] ints = new int[3];
        // ints[100]=90; java.lang.ArrayIndexOutOfBoundsException

        String s = null;
        //s.equals("data"); java.lang.NullPointerException

        Object obj = "123";
        //Integer integer =(Integer) obj;   java.lang.ClassCastException

        //обработка исключений (unchecked/checked)
        try {//в блок try помещаем потенциально опасный код,который может дать исключения. он один
            res = a / b;

        } catch (ArithmeticException e) {//блоков catch может быть несколько
            //перехватывает только указанное исключение
            System.out.println(e.getMessage());
            res = a;

        }
        System.out.println(res);

        Integer integer;
        //1 несколько исключений обрабатываются разными способами
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) obj;
            else ints[90] = 100;
        } catch (ClassCastException e) {//перехват класса ошибки и всех потомков
            System.out.println("Проблеммы с приведением типов");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        //2 несколько исключений обрабатываются одним способом

        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) obj;
            else ints[90] = 100;
        } catch (ClassCastException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Проблеммы с приведением типов или Выход за пределы массива");
        }

        //3 через общего родителя
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) obj;
            else ints[90] = 100;
        } catch (RuntimeException e) {
            System.out.println("Проблеммы с приведением типов или Выход за пределы массива");
        }


        //4 несколько исключений обрабатываются через общего родителя,нсколько -иным способом
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) obj;
            else ints[90] = 100;
        } catch (ClassCastException e) {//сначала потомок
            System.out.println("Проблеммы с приведением типов");
        } catch (RuntimeException e) {//потом родитель
            System.out.println("Проблеммы с приведением типов");
        } finally {
            //необязательный блок finally. инструкции выполнятся в случае любого исключения в блоке тру
            //инструкции связанные с закрытием ресурсов
        }


    }

//обработка исключенй времени компиляции

    public static void readFromJsonFile(String fileName) throws IOException {//ответственность за обработку лежит на участке кода,который вызывает исключение
        if(!fileName.endsWith(".json")){
            throw new IOException("Проблемы с файлом");

        }
        System.out.println("чтение из файла json");

    }



}
