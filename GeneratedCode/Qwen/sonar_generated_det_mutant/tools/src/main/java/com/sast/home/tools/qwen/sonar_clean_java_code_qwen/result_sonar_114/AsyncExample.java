package com.sast.home.tools.qwen/sonar_clean_java_code_qwen.result_sonar_114;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
class AsyncExample {

    @Async
    private void performAsyncTask() { // BUG: Methods with Spring proxying annotations should be public
        System.out.println("This task is intended to run asynchronously.");
    }

    public void showBug() {
        performAsyncTask();
    }
}