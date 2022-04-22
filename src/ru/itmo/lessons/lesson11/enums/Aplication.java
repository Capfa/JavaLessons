package ru.itmo.lessons.lesson11.enums;

import java.util.Arrays;

public class Aplication {
    public static void main(String[] args) {
        Article article1 = new Article("Путешествие по австралии");
        article1.setCountry(Country.AUSTRALIA);
        System.out.println(article1.getCountry());

        Article article2 = new Article("Путешествие по британии");
        article2.setCountry(Country.UK);
        System.out.println(article1.getCountry());

        //методы перечислений
        //получение массива констант(всех элементов enum)
        Country[] countries = Country.values();
        System.out.println(Arrays.toString(countries));
        //индекс элемента перечисления в массиве
        System.out.println(Country.FRANCE.ordinal());

        for ( Country country: countries){
            System.out.println("country "+ country.name());
        }
        //возвращает ссылку на элемент перечисления. если элемент не найден будет ошибка
        Country country = Country.valueOf("UK");
        System.out.println(country);

        Priority low1 = Priority.LOW;
        System.out.println(low1.getCode());

        low1.setCode(2);
        System.out.println(low1.getCode());

        Priority[] priorities=Priority.values();
        for(Priority priority:priorities){
            System.out.println("priority "+ priority.name()+priority.getCode());
        }
        int sumRes = Operation.SUM.action(2,3);
        System.out.println(sumRes);

        int multiRes=Operation.MULTI.action(2,3);
        System.out.println(multiRes);


        Planet[] planets= Planet.values();
        for (Planet planet:planets){
            System.out.println("planet "+ planet.name()+ " radius "+planet.getRadius()+ " weight "+planet.getWeight());
        }
    }
}
