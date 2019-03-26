package me.importtao.designpattern.decorator;

/**
 * @program design-pattern
 * @description: 定义一个具体对象，可以给这个对象添加一些职责。
 * @author: changhu
 * @create: 2019/03/25 21:54
 */
public class ConcreteCompnent extends Compnent {
    @Override
    public void operation() {
        System.out.print("ConcreteCompnent");
    }
}
