package week3;



class FirePoketmon implements PoketmonDEMO {
    @Override
    public void attack() {
        System.out.println("불공격 성공");
    }
}
class WaterPoketmon implements PoketmonDEMO {

    @Override
    public void attack() {
        System.out.println("물대포~~! 성공");
    }
}

class ElectricPoketmon implements PoketmonDEMO {
    @Override
    public void attack() {
        System.out.println("전기tjdhrd!W");
    }
}

class Triner{
    public void attackPoketmon(PoketmonDEMO poketmon){
        poketmon.attack();

    }
}

interface PoketmonDEMO {
    public static void main(String[] args) {
        Triner triner=new Triner();
        triner.attackPoketmon(new FirePoketmon());
        triner.attackPoketmon(new ElectricPoketmon());
        triner.attackPoketmon(new WaterPoketmon());
    }
//    public abstract void attack();
    void attack();

}

// 추상메소드 써서 반드시 오버라이드를해야함
