package com.sast.home.tools.codellama/sonar_clean_java_code_codellama.result_sonar_11;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController {

    @GetMapping("/api/resource/{id}")
    public String getResource(@PathVariable Long id) {
        return "Resource " + id;
    }

    @GetMapping("/api/resource")
    public List<String> getResources() {
        return List.of("Resource 1", "Resource 2", "Resource 3");
    }

    public String showBug() {
        do {
            return getResource(1L);
        } while (true);
    }
}