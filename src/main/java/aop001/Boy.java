package aop001;

public class Boy {
    public void runSomething() {
        System.out.println("열쇠를 열고 집에 들어간다.");

        try {
            System.out.println("컴으로 겜을 한다.");
        } catch (Exception e) {
            if (e.getMessage().equals("집에 불남")) {
                System.out.println("119에 신고한다.");
            }
        } finally {
            System.out.println("소등하고 잔다.");
        }
    }
}
