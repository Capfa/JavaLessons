package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;

public class Application {
    public static void main(String[] args) {
        Knight knight1= new Knight(20,17);
        BattleUnit knight2 =new Knight(20,17);
        Infantry infantry1=new Infantry(18,15);
        knight1.runFromField();
        infantry1.runFromField();

    }
}
