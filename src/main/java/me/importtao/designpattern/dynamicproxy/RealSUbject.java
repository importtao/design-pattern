package me.importtao.designpattern.dynamicproxy;

/**
 * @program design-pattern
 * @description: 真实对象（被代理的对象）
 * @author: changhu
 * @create: 2019/07/06 14:54
 */
public class RealSUbject implements Subject{
    @Override
    public void subjectDo() {
        //System.out.println("真实对象处理。。。。。。。");
    }
}
