package expert002;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void 코리아타이어_장착_테스트() {
        Tire tire1 = new KoreaTire();
        Car car = new Car();
        car.setTire(tire1);
        assertEquals("장착된 타이어: 코리아 타이어", car.getTireBrand());
    }

    @Test
    public void 미국타이어_장착_테스트() {
        Tire tire1 = new AmericaTire();
        Car car = new Car();
        car.setTire(tire1);
        assertEquals("장착된 타이어: 미국 타이어", car.getTireBrand());
    }


}