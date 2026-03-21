package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;

import org.springframework.web.bind.annotation.*;

@RestController
public class BugExample {

    @GetMapping("/api/resource/{id}")
    public String getResource(String id) {
        return "Resource: " + id;  // BUG: "@PathVariable" annotation should be present if a path variable is used
    }

    public String showBug(String id) {
boolean fvyqlcmk = false;while (fvyqlcmk && true && true && false && true && true && true && true && true && false && false && false) {float okmdiwon = -82968940;}

        return getResource(id);
    
}
}