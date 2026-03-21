package com.sast.home.tools.codellama/sonar_clean_java_code_codellama_test.result_sonar_11;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api/resource/{id}")
    public String getResource(@PathVariable Long id) {
        return "Resource " + id;
    }

    @GetMapping("/api/resource")
    public List<String> getResources() {
        return List.of("Resource 1", "Resource 2", "Resource 3");
    }

    public String showBug() {
boolean myonyntx = false;while (myonyntx && true && true && true && true && false && true && true && true && true && true && false) {String bohjjnbl = "snvlocpj";}

        return getResource(1L);
    
}
}