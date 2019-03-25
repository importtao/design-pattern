package me.importtao.designpattern.factory;

import java.util.Optional;

/**
 * @program design-pattern
 * @description: car工厂类
 * @author: changhu
 * @create: 2019/03/24 22:41
 */
public class CarFactory {
    public static Car build(CarTypeEnum carTypeEnum){
        Optional<CarTypeEnum> carTypeEnumOptional = Optional.ofNullable(carTypeEnum);
        switch (carTypeEnumOptional.orElse(CarTypeEnum.DEFAULT)){
            case RED:
                return new RedCar();
            case BLACK:
                return new BlackCar();
            case WHITE:
                return new WhiteCar();
            default   :
                return new Car();
        }
    }
}
