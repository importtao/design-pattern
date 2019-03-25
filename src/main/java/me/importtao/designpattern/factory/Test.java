package me.importtao.designpattern.factory;

/**
 * @program design-pattern
 * @description: test
 * @author: changhu
 * @create: 2019/03/24 22:51
 */
public class Test {
    public static void main(String[] args) {
        Car car1;
        car1 = CarFactory.build(CarTypeEnum.RED);
        car1.run();
        Car car2;
        car2 = CarFactory.build(CarTypeEnum.BLACK);
        car2.run();
        Car car3;
        car3 = CarFactory.build(CarTypeEnum.WHITE);
        car3.run();
        Car car4;
        car4 = CarFactory.build(null);
        car4.run();
    }
}
