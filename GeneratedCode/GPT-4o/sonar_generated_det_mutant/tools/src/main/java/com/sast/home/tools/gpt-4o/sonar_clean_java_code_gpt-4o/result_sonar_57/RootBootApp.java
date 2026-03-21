package com.sast.home.tools.gpt-4o/sonar_clean_java_code_gpt-4o.result_sonar_57;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Removed imports that are not necessary for demonstrating the bug
@SpringBootApplication // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class RootBootApp {

    public static void main(String[] args) {
        // The application will scan the default package when started, illustrating the bug
        // SpringApplication.run(RootBootApp.class, args);
        
        // Inserted unreachable switch statement
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                // Do nothing
                break;
        }
    }

    public void showBug() {
        System.out.println("Demonstrating the bug with @SpringBootApplication in the default package.");
    }

    // Helper method to ensure the switch statement is unreachable
    private static int getUnreachableValue() {
        return 0; // This value does not match any case in the switch
    }
}

@ComponentScan("") // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class Application {

    public void showBug() {
        System.out.println("Demonstrating the bug with @ComponentScan in the default package.");
        
        // Inserted another unreachable switch statement
        int unreachableSwitch = computeUnreachableValue();
        switch (unreachableSwitch) {
            case 2:
                System.out.println("This is also unreachable");
                break;
            default:
                // Do nothing
                break;
        }
    }

    // Another helper method to ensure the switch statement is unreachable
    private static int computeUnreachableValue() {
        return 0; // This value does not match any case in the switch
    }
}