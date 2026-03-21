package com.sast.home.tools.qwen/sonar_clean_java_code_qwen.result_sonar_18;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
class BugDemonstration {

    public String showBug(Model model) {
        // Adding a model attribute with an invalid name
        model.addAttribute("1invalidName", "This is an invalid attribute name"); // BUG: Model attributes should follow the Java identifier naming convention
        return "bugView";
    }
}