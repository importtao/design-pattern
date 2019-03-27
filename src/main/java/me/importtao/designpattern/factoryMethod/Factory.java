package me.importtao.designpattern.factoryMethod;

import me.importtao.designpattern.factory.CarTypeEnum;

import java.util.Optional;

/**
 * @program design-pattern
 * @description: car工厂类
 * @author: changhu
 * @create: 2019/03/24 22:41
 */
public interface Factory {
    public  Car createCar();
}
