package me.importtao.designpattern.decorator;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/03/25 23:44
 */
public class Test {
    public static void main(String[] args) {
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        ConcreteDecoratorD concreteDecoratorD = new ConcreteDecoratorD();
        Decorator decorator = new Decorator();
        concreteDecoratorA.setCompnent(decorator);
        concreteDecoratorB.setCompnent(concreteDecoratorA);
        concreteDecoratorD.setCompnent(concreteDecoratorB);
        concreteDecoratorD.operation();
    }
}
