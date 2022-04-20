package org.example;

public class Lina extends MagicCharacter implements TargetSkill{
    public Lina(){
        super("Lina", 70, 800, 120);


    }


    public boolean skill(Character c) {
        if(mana>=60) {
            super.mana -= 60;
            attack(c);
            return true;
        }else {
            return false;
        }
    }

    public void attack(Character c) {
        c.health-=damage;
        if(c.isDie()){
            super.mana+=45;
        }
    }
}
