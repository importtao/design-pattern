package me.importtao.designpattern.factoryMethod;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/03/27 23:06
 */
public class BlackCarFactory implements Factory {
    @Override
    public Car createCar() {
        return new BlackCar();
    }
}
