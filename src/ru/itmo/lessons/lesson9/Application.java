package ru.itmo.lessons.lesson9;

public class Application {
    public static void main(String[] args) {
        Point a =new Point(23,-12);
        Point b = new Point(23,12);
        System.out.println(a);
        System.out.println(b);
        //по умолчанию сравниваетссылки и должен быть переопределен в классе
        System.out.println(a.equals(b));

        //клонирование(clone). у метода по умолчанию модификатор протектед, метод нужно переопределить
        Point aClone=a.clone();
        System.out.println(a==aClone);//false
        System.out.println(a.equals(aClone));//true

        Point[]points=new Point[4];
    }
}
