package com.sast.home.tools.sonar_clean_java_code.result_sonar_12;

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
        int iwftdqfs = 0;switch  (iwftdqfs) {case 1:byte rwaekfvc = 112;break;default:char qlpozcxw = 'u';break;}
        SingletonInConfigurationBug bug = getInstance();
        System.out.println(bug.showBug());
    
}

    public String showBug() {
        return "This is a bug";
    }
}