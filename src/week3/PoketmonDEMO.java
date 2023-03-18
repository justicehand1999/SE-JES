package week3;



class FirePoketmon extends PoketmonDEMO {
    @Override
    public void attack() {
        System.out.println("불공겅");
    }

    public FirePoketmon() {
    }
}
class WaterPoketmon extends PoketmonDEMO {

}

class ElectricPoketmon extends PoketmonDEMO {
    @Override
    public void attack() {
        throw new UnsupportedOperationException("미구현");
    }
}

class Triner{
    public void attackPoketmon(PoketmonDEMO poketmon){
        poketmon.attack();

    }
}

public class PoketmonDEMO {
    public static void main(String[] args) {
        Triner triner=new Triner();
        triner.attackPoketmon(new FirePoketmon());
        triner.attackPoketmon(new ElectricPoketmon());
        triner.attackPoketmon(new WaterPoketmon());
    }
    public void attack(){
        System.out.println("공격실패!");
    }

}

// 추상메소드 써서 반드시 오버라이드를해야함
