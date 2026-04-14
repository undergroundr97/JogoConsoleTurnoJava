package entities.enemyTypes;

import entities.Enemy;

public class Mage extends Enemy {
    public Mage() {
        super();
        this.enemyName = "Mage";
        this.attack = attackUpdate();
    }

    private double attackUpdate(){
        return this.attack * 2;
    }
}
