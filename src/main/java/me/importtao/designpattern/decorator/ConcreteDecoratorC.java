package me.importtao.designpattern.decorator;

/**
 * @program design-pattern
 * @description: 装饰对象
 * @author: changhu
 * @create: 2019/03/25 23:40
 */
public class ConcreteDecoratorC extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.print("  C裙子👗");
    }
}
