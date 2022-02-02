package cooperation;

public class Student {
    String name;
    int grade;
    int money;

    public Student (String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }
    public void takeSub(Subway sub) {
        sub.take(1500);
        this.money -= 1500;
    }
    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " +
                money + "입니다.");
    }
}
