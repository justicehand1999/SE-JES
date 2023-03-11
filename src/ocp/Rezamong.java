package ocp;


public class Rezamong extends Poketmon {

    public Rezamong(int level, String name, int hp) {
        super(level, name, hp);
        System.out.println("리지몽~!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 화둔 공격을 합니다.");
    }

    @Override
    public void evolve(){
        level++;
        setHp(getHp()+10);
        System.out.println("리자몽몽이 레벨업~~!!");

    }
}
