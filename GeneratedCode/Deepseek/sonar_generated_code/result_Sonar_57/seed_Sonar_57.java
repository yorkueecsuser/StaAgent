package com.sast.home.tools.sonar_clean_java_code.result_sonar_57;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Compliant; RootBootApp belongs to the "hello" package
public class RootBootApp {
    public static void main(String[] args) {
        // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    }
}