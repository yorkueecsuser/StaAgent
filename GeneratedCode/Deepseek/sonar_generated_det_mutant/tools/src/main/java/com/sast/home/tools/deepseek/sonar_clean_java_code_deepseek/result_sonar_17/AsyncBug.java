package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_17;


import org.springframework.scheduling.annotation.Async;

class AsyncMethodBug {

    @Async
    public String r() {
        return "This is a bug"; // BUG: Async methods should return void or Future
    }
}