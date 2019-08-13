package me.importtao.designpattern.dynamicproxy;
/***
 * 动态代理模式
 * 普通代理模式编译时生成代理，不够灵活，动态代理是运行时才生成代理，性能不如静态代理
 * 1.JDK动态代理：基于接口实现，被代理类需要实现接口,jdk1.8开始JDK动态代理性能优于CGLIB动态代理。
 * 2.CGLIB动态代理：基于继承实现，被代理类不能是final。
 * */