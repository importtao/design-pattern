package me.importtao.designpattern.proxy;

/**
 * @program design-pattern
 * @description: 真实实体
 * @author: changhu
 * @create: 2019/03/26 22:38
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实对象执行方法");
    }
}
