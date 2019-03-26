package me.importtao.designpattern.proxy;

import java.util.Optional;

/**
 * @program design-pattern
 * @description: 代理类 可以代替真实实体
 * @author: changhu
 * @create: 2019/03/26 22:40
 */
public class Proxy extends Subject {
    RealSubject realSubject;
    @Override
    public void request() {
        Optional<RealSubject> realSubjectOptional = Optional.ofNullable(realSubject);
        realSubjectOptional.orElseGet(RealSubject::new).request();

    }
}
