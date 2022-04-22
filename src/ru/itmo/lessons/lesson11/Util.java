package ru.itmo.lessons.lesson11;

public class Util {
    public static int max;
    public static int min;
    public final static double PI;
    //статический блок для инициализации статических свойств(переменных)
    //инструкции выполнются 1 рз при создании класса
    static {
        PI = 3.14;

    }
    public static int random(int min,int max){
        //нельзя обратиться к нестатическим свойствам и методам из статического метода
        //нельзя обратиться к this
        return (int) (min+Math.random()*(max-min));
    }

}
