package Java_L_S_D_ooP.Lectures;

import java.util.Random;

public class task_3_Priest {
    private static final String HERO_PRIEST_D = "Hero_Priest #%d";
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int elixir;
    private int maxElixir;

    static {
        task_3_Priest.number = 0;
        task_3_Priest.r = new Random();
    }

    public task_3_Priest (String name, int hp, int elixir) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.elixir = elixir;
    }

    public task_3_Priest () {
        this(String.format(HERO_PRIEST_D, ++task_3_Priest.number),
        task_3_Priest.r.nextInt(100, 200),
        task_3_Priest.r.nextInt(50, 150));
    }

    public int Attack () {
        int damage = task_3_Priest.r.nextInt(20, 30);
        this.elixir -= (int)(damage * 0.8);
        if (elixir < 0) return 0;
        else return damage;
    }

    public String getInfo () {
        return String.format("Name: %s Hp: %d Type: %s",
            this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed (int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage (int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else {die();}
    }
}
/**
public class Priest extends BaseHero{
    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxElixir = Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
 */
