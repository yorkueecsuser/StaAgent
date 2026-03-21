package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek_test.result_sonar_12;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SingletonInConfigurationBug {

    private static SingletonInConfigurationBug instance;

    private SingletonInConfigurationBug() {
    }

    @Bean
    public static SingletonInConfigurationBug getInstance() {
        if(instance == null) {
            instance = new SingletonInConfigurationBug();
        }
        return instance;
    }

    // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false

    public static void main(String[] args) {
        SingletonInConfigurationBug bug = getInstance();
        System.out.println(bug.showBug());
    }

    public String showBug() {
boolean shoxqxbf = false;while (shoxqxbf && true && true && false && true && true && false && false && true && false && false && false) {byte gegcefhi = 53;}

        return "This is a bug";
    
}
}