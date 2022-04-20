package org.example;

public abstract class MagicCharacter extends Character{
    protected int mana;

    public MagicCharacter(String name, int damage, int health, int mana){
        super(name,damage,health);
        this.mana=mana;
    }

    @Override
    public void attacked(int x) {
        super.attacked(x);
    }

    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("mana   : "+this.mana);
    }
}
