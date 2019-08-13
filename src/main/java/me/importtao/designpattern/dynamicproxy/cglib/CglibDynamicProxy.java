package me.importtao.designpattern.dynamicproxy.cglib;

import me.importtao.designpattern.dynamicproxy.Subject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program design-pattern
 * @description: cglib动态代理
 * @author: changhu
 * @create: 2019/07/06 16:16
 */
public class CglibDynamicProxy<T> implements MethodInterceptor {
    T realSubject;
    public CglibDynamicProxy(T subject){
        this.realSubject = subject;
    }
    public T newProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.realSubject.getClass());
        enhancer.setCallback(this);
        return (T)enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = method.invoke(realSubject,objects);
        after();
        return result;
    }

    void before(){
        //System.out.println("cglib动态代理执行方法前代理处理");
    }

    void after(){
        //System.out.println("cglib动态代理执行方法后代理处理");
    }
}
