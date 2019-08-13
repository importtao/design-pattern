package me.importtao.designpattern.dynamicproxy.jdk;

import me.importtao.designpattern.dynamicproxy.ProxyUtils;
import me.importtao.designpattern.dynamicproxy.RealSUbject;
import me.importtao.designpattern.dynamicproxy.Subject;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/07/06 15:35
 */
public class Client {
    public static void main(String[] args) {
        RealSUbject realSUbject = new RealSUbject();
        JDKDynamicProxy<Subject> jdkDynamicProxy = new JDKDynamicProxy(realSUbject);
        //获取代理类实例sell
        Subject proxySubject = jdkDynamicProxy.newProxyInstance();
        //通过代理类对象调用代理类方法，实际上会转到invoke方法调用
        realSUbject.subjectDo();
        System.out.println("===========================");
        proxySubject.subjectDo();
        ProxyUtils.generateClassFile(realSUbject.getClass(), "RealSubjectJdkProxy");


    }
}
