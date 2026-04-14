package entities.enemyTypes;

import entities.Enemy;

public class Warrior extends Enemy {
    public Warrior(){
        super();
        this.attack = attackUpdate();
        this.enemyName = "Warrior";

    }
    private double attackUpdate(){
        return this.attack * 1.5;
    }


}
