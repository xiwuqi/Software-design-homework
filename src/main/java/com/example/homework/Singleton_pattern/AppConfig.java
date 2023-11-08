package com.example.homework.Singleton_pattern;

public class AppConfig {
    // 使用volatile关键字保证instance变量的可见性和有序性
    private static volatile AppConfig instance = null;

    // 私有构造函数，防止外部实例化
    private AppConfig() {
        // 这里可以放置初始化代码，比如加载配置文件等
    }

    // 提供一个全局访问点获取唯一的实例
    public static AppConfig getInstance() {
        if (instance == null) {
            // 同步块，确保多线程环境下的正确实例化
            synchronized (AppConfig.class) {
                // 再次检查实例是否存在，因为多线程环境下可能有多个线程一起过了第一次null检查
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    // 示例方法
    public String getConfigValue(String key) {
        // 模拟从配置获取值的过程
        // 实际情况下这里会从配置文件中读取
        return "Some Config Value for " + key;
    }
}

