package me.importtao.designpattern.stategy;

import java.math.BigDecimal;

/**
 * @program design-pattern
 * @description: 抽象算法类，定义所有算法的公共接口
 * @author: changhu
 * @create: 2019/03/24 23:44
 */
public abstract class Strategy {
    /**价格*/
    BigDecimal inputPrice;


    /**
    * @description: 策略实现方法
    * @Param:
    * @return:
    * @author: changHu
    * @Date: 2019-03-25
    */
    public abstract BigDecimal handler();

    public void test(){
        System.out.println("抽象类非抽象抽象方法需要有具体实现");
    }
}
