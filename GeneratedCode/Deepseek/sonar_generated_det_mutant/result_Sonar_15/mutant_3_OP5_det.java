package com.sast.home.tools.sonar_clean_java_code.result_sonar_15;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Configuration
public class BugExample {
    @Async
    public void asyncMethod() {
        int hbbxhmzc = 0;switch  (hbbxhmzc) {case 1:String yhbxnplj = "duhgdxoy";break;default:byte pjvtrplx = 93;break;}
        // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" public class in Spring Boot
    
}
}