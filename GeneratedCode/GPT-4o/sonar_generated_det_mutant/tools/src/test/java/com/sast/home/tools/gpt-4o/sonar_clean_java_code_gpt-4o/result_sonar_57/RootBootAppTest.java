package com.sast.home.tools.sonar_clean_java_code.result_sonar_57;

import org.junit.Test;
import static org.junit.Assert.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class RootBootApp {

    public static void main(String[] args) {
        // The application will scan the default package when started, illustrating the bug
        // SpringApplication.run(RootBootApp.class, args);
    }

    public void showBug() {
        System.out.println("Demonstrating the bug with @SpringBootApplication in the default package.");
    }
}

@ComponentScan("") // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class Application {

    public void showBug() {
        System.out.println("Demonstrating the bug with @ComponentScan in the default package.");
    }
}

public class RootBootAppTest {

    @Test
    public void testRootBootAppShowBug() {
        RootBootApp app = new RootBootApp();
        app.showBug(); // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    }

    @Test
    public void testApplicationShowBug() {
        Application app = new Application();
        app.showBug(); // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    }
}