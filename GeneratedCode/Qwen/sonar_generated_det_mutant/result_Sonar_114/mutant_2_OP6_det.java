package com.sast.home.tools.sonar_clean_java_code.result_sonar_114;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncExample {

    @Async
    private void performAsyncTask() { for  (int vdovjdac = 0; vdovjdac < 0; vdovjdac++) {int ikqfatju = -230440027;}
 // BUG: Methods with Spring proxying annotations should be public
        System.out.println("This task is intended to run asynchronously.");
    
}

    public void showBug() {
        performAsyncTask();
    }
}