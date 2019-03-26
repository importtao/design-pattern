package me.importtao.designpattern.decorator;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/03/25 23:42
 */
public class ConcreteDecoratorD extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.print("  D皮鞋👞");
    }
}
