package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;

import org.springframework.web.bind.annotation.*;

@RestController
public class BugExample {

    @GetMapping("/api/resource/{id}")
    public String getResource(String id) {
        return "Resource: " + id;  // BUG: "@PathVariable" annotation should be present if a path variable is used
    }

    public String showBug(String id) {
for  (int ngwaaihg = 0; ngwaaihg < 0; ngwaaihg++) {char rjzglyno = 'f';}

        return getResource(id);
    
}
}