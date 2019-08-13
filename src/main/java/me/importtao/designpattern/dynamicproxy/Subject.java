package me.importtao.designpattern.dynamicproxy;

/**
 * @program design-pattern
 * @description: 被代理对象的抽象
 * @author: changhu
 * @create: 2019/07/06 14:51
 */
public interface Subject {
    /*default void doNothing(){
        System.out.println("接口默认方法【doNothing】");
    }
    default void doSomthing(){
        System.out.println("接口默认方法");
    }*/

    void subjectDo();
}
