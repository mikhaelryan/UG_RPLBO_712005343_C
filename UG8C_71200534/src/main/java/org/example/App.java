package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Lina a = new Lina();
        DragonKnight b= new DragonKnight();
        LegionCommander c = new LegionCommander();

        a.skill(b);

        b.skill();
        b.attack(a);
        b.attack(a);

        c.skill(a);

        a.skill(c);

        a.showCharacterInfo();
        b.showCharacterInfo();
        c.showCharacterInfo();


    }
}
