package me.importtao.designpattern.stategy;

import java.math.BigDecimal;

/**
 * @program design-pattern
 * @description: 策略模式与简单工厂模式结合,可降低耦合度，对外只暴露ContextFactory
 * @author: changhu
 * @create: 2019/03/25 16:42
 */
public class ContextFactory {
    Strategy strategy;
    public ContextFactory(TypeEnum typeEnum,BigDecimal inputPrice){
        switch (typeEnum){
            case SIMPLE:
                this.strategy = new StrategyA(inputPrice,new BigDecimal("1.8"));
                break;
            case DISCOUNT:
                this.strategy = new StrategyB(inputPrice,new BigDecimal("100"),new BigDecimal("99"));
                break;
            default:
                this.strategy = new StrategyC(inputPrice) ;
                break;
        }
    }

    public BigDecimal ContexInterface(){
        return strategy.handler();
    }
}
