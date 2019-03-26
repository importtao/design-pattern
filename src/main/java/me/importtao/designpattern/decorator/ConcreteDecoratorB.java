package me.importtao.designpattern.decorator;

/**
 * @program design-pattern
 * @description: 具体装饰对象2
 * @author: changhu
 * @create: 2019/03/25 23:38
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.print("  B外套🧥");
    }
}
