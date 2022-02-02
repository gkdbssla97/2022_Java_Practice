package cooperation;

import reference.Subject;

public class TakeTrans {
    public static void main(String[] args) {
        Student st1 = new Student("하윤", 10000);
        Bus bus = new Bus(8100);
        Subway sub = new Subway(7);
        st1.showInfo();
        st1.takeBus(bus);
        st1.showInfo();
        st1.takeSub(sub);

        bus.showInfo();
        st1.showInfo();
        sub.showInfo();
    }
}
