package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resource")
public class ExampleController {

    // BUG: "@PathVariable" annotation should be present if a path variable is used
    @GetMapping("/{id}")
    public String getResource(String id) {
        return "Resource with id: " + id;
    }

    public String showBug(String id) {
        return getResource(id);
    }
}