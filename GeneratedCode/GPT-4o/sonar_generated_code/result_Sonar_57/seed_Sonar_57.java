package com.sast.home.tools.sonar_clean_java_code.result_sonar_57;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// BUG: "@SpringBootApplication" should not be used in the default package
@SpringBootApplication // BUG: "@SpringBootApplication" should not be used in the default package
public class RootBootApp {
    public static void main(String[] args) {
        SpringApplication.run(RootBootApp.public class, args);
    }

    public void showBug() {
        System.out.println("This method demonstrates the use of @SpringBootApplication in the default package.");
    }
}

// BUG: "@ComponentScan" should not be used in the default package
@ComponentScan("") // BUG: "@ComponentScan" should not be used in the default package
public class Application {
    public void showBug2() {
        System.out.println("This method demonstrates the use of @ComponentScan in the default package.");
    }
}