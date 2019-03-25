package me.importtao.designpattern.stategy;

import java.math.BigDecimal;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/03/25 16:35
 */
public class Test {
    public static void main(String[] args) {
        BigDecimal inputPrice = new BigDecimal("199");
        System.out.printf("价格：%s\n",inputPrice);
        Context context;
        context = new Context(new StrategyA(inputPrice,new BigDecimal("0.8")));
        BigDecimal result = context.ContexInterface();
        System.out.printf("实收金额：%s\n",result);


        /**与简单工厂模式结合*/
        ContextFactory contextFactory = new ContextFactory(TypeEnum.FULLMINUM,inputPrice);
        BigDecimal result1 = contextFactory.ContexInterface();
        System.out.printf("实收金额：%s\n",result1);

    }
}
