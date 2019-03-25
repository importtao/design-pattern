package me.importtao.designpattern.stategy;

import java.math.BigDecimal;

/**
 * @program design-pattern
 * @description: 策略A 打折
 * @author: changhu
 * @create: 2019/03/24 23:52
 */
public class StrategyA extends Strategy {
    /**折扣数*/
    BigDecimal discount;
    public StrategyA(BigDecimal inputPrice,BigDecimal discount){
        this.inputPrice = inputPrice;
        this.discount = discount;
    }
    private StrategyA(){}
    @Override
    public BigDecimal handler() {
        BigDecimal result = inputPrice.multiply(discount);
        System.out.printf("收费策略：打%s折;",discount);
        return result;
    }
}
