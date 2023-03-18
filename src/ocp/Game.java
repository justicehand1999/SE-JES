package ocp;

public class Game {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(2,"피카",300);
        Rezamong rezamong = new Rezamong(5,"리자몽",500);

        Poketmon poketmon = new Pikachu(2,"ddd",302);

        poketmon.attack();
        rezamong.attack();
        poketmon.evolve();
        rezamong.evolve();
    }
}
