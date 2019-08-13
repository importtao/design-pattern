package me.importtao.designpattern.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/07/06 14:50
 */
public  class  JDKDynamicProxy<T> implements InvocationHandler {
    T realSubject;

    public JDKDynamicProxy(T object){
        this.realSubject = object;
    }

    public T newProxyInstance(){
        return (T)Proxy.newProxyInstance(this.realSubject.getClass().getClassLoader(),this.realSubject.getClass().getInterfaces(),this);
    }

    void before(){
        //System.out.println("jdk动态代理执行方法前代理处理");
    }

    void after(){
        //System.out.println("jdk动态代理执行方法后代理处理");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(realSubject,args);
        after();
        return result;
    }
}
