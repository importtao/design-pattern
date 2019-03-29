package me.importtao.designpattern.prototype;

/**
 * @program design-pattern
 * @description: 具体对象类
 * @author: changhu
 * @create: 2019/03/29 20:31
 */
public class ConcretePrototype implements Prototype{
    private String name;
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.remark = this.remark;
        return concretePrototype;
    }
}
