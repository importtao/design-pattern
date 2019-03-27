package me.importtao.designpattern.factoryMethod;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/03/27 23:09
 */
public class WhiteCarFactory implements Factory {
    @Override
    public Car createCar() {
        return new WhiteCar();
    }
}
