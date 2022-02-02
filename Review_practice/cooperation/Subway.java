package cooperation;

public class Subway {
    int subNum;
    int passenger;
    int money;

    public Subway(int subNum) {
        this.subNum = subNum;
    }
    public void take(int money) {
        this.money += money;
        passenger++;
    }
    public void showInfo() {
        System.out.println("전철" + subNum + "번의 승객은 " +
                passenger + "명이고 수입은 " + money + "입니다.");
    }
}
