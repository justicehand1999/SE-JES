package ocp;


public class Pikachu extends Poketmon {

    public Pikachu(int level, String name, int hp) {
        super(level, name, hp);
        System.out.println("피까! 피까~!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 100만볼트 공격을 합니다.");
    }

    @Override
    public void evolve(){
        level++;
        setHp(getHp()+10);
        System.out.println(getName()+"이(가) Lv."+level+ "로 레벨업~~!!");

    }
}
