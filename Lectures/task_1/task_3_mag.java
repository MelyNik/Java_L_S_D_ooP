package Java_L_S_D_ooP.Lectures.task_1;

import java.util.Random;

public class task_3_mag {
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static {
        task_3_mag.number = 0;
        task_3_mag.r = new Random();
    }

    public task_3_mag (String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    public task_3_mag () {
        this(String.format("Hero_Magician #%d", ++task_3_mag.number),
        task_3_mag.r.nextInt(100, 200), 
        task_3_mag.r.nextInt(50, 150));
    }

    public int Attack () {
        int damage = task_3_mag.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo () {
        return String.format("Name: %s Hp: %d Energy: %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }

    public void healed (int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage (int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        //else {die();}
    }
}
/*

public class Magician extends BaseHero{
    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }
}
 */