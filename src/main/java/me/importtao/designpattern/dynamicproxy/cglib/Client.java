package me.importtao.designpattern.dynamicproxy.cglib;

import me.importtao.designpattern.dynamicproxy.ProxyUtils;
import me.importtao.designpattern.dynamicproxy.RealSUbject;
import me.importtao.designpattern.dynamicproxy.Subject;
import net.sf.cglib.proxy.Enhancer;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/07/06 16:21
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSUbject();
        CglibDynamicProxy<Subject> cglibDynamicProxy = new CglibDynamicProxy(subject);
        Subject proxy = cglibDynamicProxy.newProxyInstance();
        proxy.subjectDo();
        ProxyUtils.generateClassFile(subject.getClass(), "RealSubjectCglibProxy");


    }
}
