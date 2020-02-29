package me.importtao.designpattern.abstractFactory;

/**
 * @program design-pattern
 * @description: 抽象处理类
 * @author: changhu
 * @create: 2019/11/06 13:33
 */
 public   abstract class Handler {
    Handler nextHandler;
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    public Handler getNextHandler() {
        return nextHandler;
    }

     public abstract <T> void handler(T t);
}
