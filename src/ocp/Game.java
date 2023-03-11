package ocp;

public class Game {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(2,"피카",300);
        Rezamong rezamong = new Rezamong(5,"리자몽",500);

        pikachu.attack();
        rezamong.attack();
        pikachu.evolve();
        rezamong.evolve();
    }
}
