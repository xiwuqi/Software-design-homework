package com.example.homework.Singleton_pattern;

// 测试类
public class SingletonTest {
    public static void main(String[] args) {
        // 获取单例对象并调用其方法
        AppConfig config = AppConfig.getInstance();
        String configValue = config.getConfigValue("myKey");

        System.out.println(configValue);
    }
}
