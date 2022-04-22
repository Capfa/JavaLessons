package ru.itmo.lessons.lesson7;
import ru.itmo.lessons.lesson7.base.AttackAble;
import ru.itmo.lessons.lesson7.base.BattleUnit;
public final class Infantry extends BattleUnit implements AttackAble {
    private int additionalAttack = 5;
    public Infantry(int healthScore ,int attackScore){
        super(healthScore,attackScore);
    }
     public void infantryoid(){
        System.out.println("Метод Infantry");
    }
    public boolean runFromField(){
        if(super.runFromField()){
            attackScore-=3;
            System.out.println("После бегста атака уменьшеа на 3");
            return true;
        };
        return false;

    }
    public void rest(){
        plusHealth(1);
        System.out.println("Отдых пехотинца");
    }
    public void attack(BattleUnit enemy){
        if (enemy.isAlive()&&this.isAlive())enemy.minusHealth(attackScore);
        if (enemy.isAlive())this.minusHealth(enemy.getHealthScore());
    }

}
