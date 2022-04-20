package org.example;

public abstract class PhysicalCharacter extends Character{
    protected int armor;

    public PhysicalCharacter(String name, int damage, int health, int armor){
        super(name,damage,health);
        this.armor=armor;
    }


    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Armor   : "+this.armor);
    }

    public void attacked(int x) {
        super.attacked((x-this.armor));
    }
}
