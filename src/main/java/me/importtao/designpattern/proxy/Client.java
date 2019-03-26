package me.importtao.designpattern.proxy;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/03/26 22:45
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
