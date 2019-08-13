package me.importtao.designpattern.dynamicproxy;

import me.importtao.designpattern.dynamicproxy.cglib.CglibDynamicProxy;
import me.importtao.designpattern.dynamicproxy.jdk.JDKDynamicProxy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program design-pattern
 * @description:
 * @author: changhu
 * @create: 2019/07/06 17:12
 */
public class ProxyTest {
    public static void main(String[] args) {
        //创建测试对象
        RealSUbject realSUbject = new RealSUbject();
        JDKDynamicProxy<Subject> jdkDynamicProxy = new JDKDynamicProxy(realSUbject);
        //获取代理类实例sell
        Subject jdk = jdkDynamicProxy.newProxyInstance();

        Subject subject = new RealSUbject();
        CglibDynamicProxy<Subject> cglibDynamicProxy = new CglibDynamicProxy(subject);
        Subject cglib = cglibDynamicProxy.newProxyInstance();

        //预热一下
        int preRunCount = 100;
        runWithoutMonitor(jdk, preRunCount);
        runWithoutMonitor(cglib, preRunCount);

        //执行测试
        Map<String, Subject> tests = new LinkedHashMap<String, Subject>();
        tests.put("Jdk  ", jdk);
        tests.put("Cglib    ", cglib);
        int repeatCount = 2;
        int runCount = 10000;
        runTest(repeatCount, runCount, tests);
        runCount = 10000;
        runTest(repeatCount, runCount, tests);
    }

    private static void runTest(int repeatCount, int runCount, Map<String, Subject> tests) {
        System.out.println(
                String.format("\n===== run test : [repeatCount=%s] [runCount=%s] [java.version=%s] =====",
                        repeatCount, runCount, System.getProperty("java.version")));
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(String.format("\n--------- test : [%s] ---------", (i + 1)));
            for (String key : tests.keySet()) {
                runWithMonitor(tests.get(key), runCount, key);
            }
        }
    }

    private static void runWithoutMonitor(Subject target, int runCount) {
        for (int i = 0; i < runCount; i++) {
            target.subjectDo();
        }
    }

    private static void runWithMonitor(Subject target, int runCount, String tag) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < runCount; i++) {
            target.subjectDo();
        }
        long end = System.currentTimeMillis();
        System.out.println("[" + tag + "] Total Time:" + (end - start) + "ms");
    }
}
