package me.importtao.designpattern.stategy;

import java.math.BigDecimal;

/**
 * @program design-pattern
 * @description: 上下文 初始化时传入具体的策略对象，根据该对象调用对应算法。
 * @author: changhu
 * @create: 2019/03/24 23:42
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public BigDecimal ContexInterface(){
        return strategy.handler();
    }
}
