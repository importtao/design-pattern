package me.importtao.designpattern.stategy;

import java.math.BigDecimal;

/**
 * @program design-pattern
 * @description: 策略B 满减
 * @author: changhu
 * @create: 2019/03/25 15:16
 */
public class StrategyB extends Strategy {
    /**满full减minus*/
    BigDecimal full;
    BigDecimal minus;
    public StrategyB(BigDecimal inputPrice,BigDecimal full,BigDecimal minus){
        this.inputPrice = inputPrice;
        this.full = full;
        this.minus = minus;
    }
    @Override
    public BigDecimal handler() {
        BigDecimal result = BigDecimal.ZERO;
        if(this.inputPrice.compareTo(this.full)>0){
            result = this.inputPrice.subtract(this.minus);
        }else{
            result = this.inputPrice;
        }
        System.out.printf("收费策略：满%s减%s;",full,minus);
        return result;
    }
}
