package entities.enemyTypes;

import entities.Enemy;

public class Archer extends Enemy {
    public Archer(){
        super();
        this.attack = attackUpdate();
        this.enemyName = "Archer";
    }
    private double attackUpdate(){
        return this.attack * 1.3;
    }
}
