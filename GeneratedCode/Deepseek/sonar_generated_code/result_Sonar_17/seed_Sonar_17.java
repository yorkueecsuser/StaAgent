package com.sast.home.tools.sonar_clean_java_code.result_sonar_17;

// Import statement
import org.springframework.scheduling.annotation.Async;

// Class declaration
public class AsyncBug {

    // Async method with a non-void return type
    @Async
    public int asyncMethod() {
        // BUG: Async methods should return void or Future
        return 42;
    }

    // showBug method to demonstrate the bug
    public int showBug() {
        return asyncMethod();
    }

    // Main method for testing
    public static void main(String[] args) {
        AsyncBug asyncBug = new AsyncBug();
        int result = asyncBug.showBug();
        System.out.println(result);
    }
}