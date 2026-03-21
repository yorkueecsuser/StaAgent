package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek_test.result_sonar_11;


import org.springframework.web.bind.annotation.*;

@RestController
public class BugExample {

    @GetMapping("/api/resource/{id}")
    public String getResource(String id) {
        return "Resource: " + id;  // BUG: "@PathVariable" annotation should be present if a path variable is used
    }

    public String showBug(String id) {
boolean pnifvfvk = false;while (pnifvfvk && true && false && false && false && true && true && false && true && false && false && false) {int uyxjsazk = 678045778;}

        return getResource(id);
    
}
}