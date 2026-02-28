package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugDemonstrationController {

    @GetMapping("/api/resource/{id}")
    public String getResourceById(String id) { // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "Resource ID: " + id;
    }

    public String showBug(String id) {
        return getResourceById(id);
    }
}