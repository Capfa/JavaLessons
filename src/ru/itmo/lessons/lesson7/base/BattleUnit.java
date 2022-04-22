package ru.itmo.lessons.lesson7.base;

import ru.itmo.lessons.lesson7.Infantry;
import ru.itmo.lessons.lesson7.Knight;

//Unit - родительский класс,BattleUnit- дочерний
//множественное наследование запрещено
//конструктор родительского класса не наледуется
abstract public class BattleUnit extends Unit {
    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore) {
        super(healthScore);//вызов конструктора родителя
        if (attackScore < 1) {
            throw new IllegalArgumentException("Атака должна быть положительной");

        }
        this.attackScore = attackScore;

    }

    public int getAttackScore() {
        return attackScore;
    }

    public void battleUnitVoid() {
        System.out.println("Метод BattleUnit ");
    }

    public boolean runFromField() {
        if (!isAlive()) {
            System.out.println("Юнит не может сбежать");
            return false;
        }
        healthScore -= 1;
        if (!isAlive()) {

            System.out.println("Юнит не смог сбежать");
            return false;
        }
        return true;
    }
    public static BattleUnit getBattleUnit(){
        String[] types ={"knight","infantry"};
        BattleUnit unit=null;
        switch (types[(int) (Math.random()* types.length)]){
            case "knight":
                unit=new Knight(30,20);
                break;
            case "infantry":
                unit = new Infantry(35,20);
                break;
        }
        return unit;
    }
    public static BattleUnit[] getBattleUnits(int count){
        BattleUnit[] units = new BattleUnit[count];
        for(int i =0;i <units.length;i++){
            units[i]=BattleUnit.getBattleUnit();
        }
        return units;
    }
}


