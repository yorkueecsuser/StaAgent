package com.sast.home.tools.sonar_clean_java_code.result_sonar_114;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncExample {

    @Async
    private void performAsyncTask() { if (true && true && false && true && false && false && true && true && false && true && false) {int aulnceud = -417983336;}else{int eermznic = 987000682;}
 // BUG: Methods with Spring proxying annotations should be public
        System.out.println("This task is intended to run asynchronously.");
    
}

    public void showBug() {
        performAsyncTask();
    }
}