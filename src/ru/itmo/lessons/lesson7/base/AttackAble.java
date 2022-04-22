package ru.itmo.lessons.lesson7.base;
//нельзя создать экземпляр
public interface AttackAble {
    public void attack(BattleUnit enemy);
    //можно создать метод с реализацией но он должен быть указан как дефолт
    default void someVoid(){
        System.out.println("Методы с реализацией");
    }
}
