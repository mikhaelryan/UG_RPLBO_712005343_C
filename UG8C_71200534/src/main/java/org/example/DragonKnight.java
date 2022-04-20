package org.example;

public abstract class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    private int dragonFormAttack;

    public DragonKnight(){
        super("Dragon Knight",95,1800, 50);

    }

    public DragonKnight(String name, int damage, int health, int armor) {
        super(name, damage, health, armor);
    }

    public void skill(){
        this.dragonFormAttack=2;
    }

    public void attack(Character c){
        if (dragonFormAttack>0){
            super.damage+=90;
            this.dragonFormAttack-=1;
        }
        c.health-=super.damage;
    }
}
