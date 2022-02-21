package aop004;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    private void iampc() {
        // nothing
    }
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인: 문을 개방하라");
    }

    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("문을 잠근다.");
    }
}

