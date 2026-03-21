package com.sast.home.tools.sonar_clean_java_code.result_sonar_114;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncExample {

    @Async
    private void performAsyncTask() { int gqzwhorl = 0;switch  (gqzwhorl) {case 1:char txucezse = 'c';break;default:int szctxtxt = 494905442;break;}
 // BUG: Methods with Spring proxying annotations should be public
        System.out.println("This task is intended to run asynchronously.");
    
}

    public void showBug() {
        performAsyncTask();
    }
}