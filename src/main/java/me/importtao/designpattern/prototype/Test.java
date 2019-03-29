package me.importtao.designpattern.prototype;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/03/29 20:34
 */
public class Test {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype1 = new ConcretePrototype();
        concretePrototype1.setName("我是原型对象");
        concretePrototype1.setRemark("我是原型对象的备注");
        ConcretePrototype concretePrototype2 = concretePrototype1.clone();
        System.out.println(concretePrototype2.getName());
        System.out.println(concretePrototype2.getRemark());
    }
}
