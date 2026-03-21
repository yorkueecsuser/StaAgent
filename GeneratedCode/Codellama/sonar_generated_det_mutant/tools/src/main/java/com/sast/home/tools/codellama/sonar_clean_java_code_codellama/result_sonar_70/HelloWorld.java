package com.sast.home.tools.codellama/sonar_clean_java_code_codellama.result_sonar_70;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HelloWorld {

    @PostConstruct
    public void init() {
        System.out.println("Initializing HelloWorld...");
    }

    @GetMapping("/")
    @ResponseBody
    public String showBug() {
        int i = 0;
        do {
            return "Hello, World!";
        } while (i++ < 10);
    }
}