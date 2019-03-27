package me.importtao.designpattern.factoryMethod;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/03/27 23:12
 */
public class Test {
    public static void main(String[] args) {
        Car car1 = new RedCarFactory().createCar();
        car1.run();

        Car car2 = new BlackCarFactory().createCar();
        car2.run();
    }
}
