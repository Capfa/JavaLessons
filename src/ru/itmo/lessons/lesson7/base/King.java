package ru.itmo.lessons.lesson7.base;

import ru.itmo.lessons.lesson7.base.Unit;

public final class King extends Unit {
    private int gold = 500;
    private BattleUnit[] army;

    public King(int healthScore) {
        super(healthScore);
    }

    public void rest() {
        gold -= 50;
        plusHealth(5);
        System.out.println("отдых короля");
    }

    public void geneateArmy() {
        if (gold < 250) {
            System.out.println(("Армия стоит 250, у короля" + gold));
            return;
        }
        gold -= 250;
        army = BattleUnit.getBattleUnits(20);

    }

    public void changeUnits() {

        for (int i = 0; i < army.length; i++) {
            if (gold < 20) {
                System.out.println("Юнит стоит 20, у короля" + gold);
                return;
            }
            if (army[i] != null && !army[i].isAlive()) {
                gold -= 20;
                army[i] = BattleUnit.getBattleUnit();
            }

        }

    }

}
