package me.importtao.designpattern.decorator;

/**
 * @program design-pattern
 * @description: 具体装饰对象，给Comonent添加职责
 * @author: changhu
 * @create: 2019/03/25 22:54
 */
public class ConcreteDecoratorA extends Decorator {
    @Override
    public void operation() {
        super.operation();
        System.out.print("  A帽子🎩");
    }
}
