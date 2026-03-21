package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_12;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class SingletonInConfigurationBug {

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

    public static void main(String[] args) {
        SingletonInConfigurationBug bug = getInstance();
        System.out.println(bug.showBug());
    }

    public String showBug() {
        return "This is a bug";
    }
}