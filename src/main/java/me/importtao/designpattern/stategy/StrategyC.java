package me.importtao.designpattern.stategy;

import java.math.BigDecimal;

/**
 * @program design-pattern
 * @description: 策略c 正常收费
 * @author: changhu
 * @create: 2019/03/25 15:33
 */
public class StrategyC extends Strategy {
    public StrategyC(BigDecimal inputPrice){
        this.inputPrice = inputPrice;
    }
    private StrategyC(){}
    @Override
    public BigDecimal handler() {
        System.out.println("收费策略：正常收费;");
        return this.inputPrice;
    }
}
