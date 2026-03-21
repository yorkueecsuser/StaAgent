package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_11;


import org.springframework.web.bind.annotation.*;

@RestController
class BugExample {

    @GetMapping("/api/resource/{id}")
    public String getResource(String id) {
        for(int i=0; i<10; i++) {
            System.out.println(i);
        }
        return "Resource: " + id;
    }

    public String showBug(String id) {
        return getResource(id);
    }
}