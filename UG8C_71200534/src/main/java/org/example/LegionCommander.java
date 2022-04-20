package org.example;

public class LegionCommander extends PhysicalCharacter implements TargetSkill{
    private int kill;

    public LegionCommander(){
        super("Legion Commander", 120, 1200, 30);

    }

    public void attack(Character c){
        c.health-=damage;
        if (c.isDie()){
            super.damage+=10;
        }
    }

    public boolean skill(Character c){
        while (!isDie() && c.isDie()){
            attack(c);
        }
        return true;
    }
}
