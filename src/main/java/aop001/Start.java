package aop001;

public class Start {
    public static void main(String[] args) {
        Boy r = new Boy();
        Girl j = new Girl();

        r.runSomething();
        j.runSomething();
    }
}
