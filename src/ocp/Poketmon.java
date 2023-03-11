package ocp;


public abstract class Poketmon {
    public int level;
    private String name;
    private int hp;

    public Poketmon(int level, String name, int hp) {
        this.level = level;
        this.name = name;
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public abstract void attack();

    public abstract void evolve();
}
