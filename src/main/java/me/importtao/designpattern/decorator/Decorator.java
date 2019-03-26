package me.importtao.designpattern.decorator;

import java.util.Optional;

/**
 * @program design-pattern
 * @description: 装饰抽象类，继承Compnent,从外来类来扩展Compnent类的功能，对于Compnent来说，无需知道Decorator的存在。
 * @author: changhu
 * @create: 2019/03/25 21:57
 */
public class Decorator extends Compnent {
    protected Compnent compnent;

    public void setCompnent(Compnent compnent) {
        this.compnent = compnent;
    }

    @Override
    public void operation() {
        Optional<Compnent> compnentOptional = Optional.ofNullable(this.compnent);
        compnentOptional.ifPresent(Compnent::operation);
    }
}
