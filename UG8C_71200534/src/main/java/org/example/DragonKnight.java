package org.example;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    private int dragonFormAttack;

    public DragonKnight(){
        super("Dragon Knight",95,1800, 50);

    }


    public void skill(){
        this.dragonFormAttack=2;
    }

    public void attack(Character c){
        if (dragonFormAttack>0){
            this.dragonFormAttack-=1;
            c.health-=damage+90;
        }else {
            c.health -= damage;
        }
    }
}
