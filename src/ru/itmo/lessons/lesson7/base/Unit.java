package ru.itmo.lessons.lesson7.base;

//родительский класс
//абстрактный класс-класс,которому не создаются экземпляры
//может содержать абтрактные методы
abstract public class Unit {
    //доступ к свойству из текущего класса и дочерних класов
    protected int healthScore;
    private int maxHealthScore;
    public Unit(int healthScore){
        if (healthScore<1){
            throw new IllegalArgumentException("Здоровьедолжно быть положительным значением");
        }
        this.healthScore=healthScore;
        maxHealthScore=healthScore;
    }

    public int getHealthScore() {
        return healthScore;
    }

    //добавить здоровье но не больше изначального если персонаж жив
    public void plusHealth(int healthScore){
        if (!isAlive()) return;
        this.healthScore= Math.min(this.healthScore + healthScore,maxHealthScore);
    }

    //уменьшить здоровье но не меньше 0
    public void minusHealth(int healthScore){
        if (!isAlive()) return;
        this.healthScore -= healthScore;
    }
    //метод вернет тру если здоровье больше 0 и фолс если нет
    public boolean isAlive(){
        return healthScore>0;
    }

    public abstract void rest();
}
