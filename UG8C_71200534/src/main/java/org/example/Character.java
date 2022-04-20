package org.example;

public abstract class Character implements ObjectAttack{

    protected int damage;
    protected String name;
    protected int health;


    public Character(String name, int damage,  int health) {
        this.damage = damage;
        this.name = name;
        this.health = health;
    }

    public void showCharacterInfo(){
        System.out.println("Hero   : "+name);;
        System.out.println("Health  : "+health);
        System.out.println("Damage  : "+damage);
    }

    public boolean isDie(){
        if (health <= 0){
            return true;
        }else {
            return false;
        }
    }

    public void attacked(int x){
        health-=x;
    }
}
