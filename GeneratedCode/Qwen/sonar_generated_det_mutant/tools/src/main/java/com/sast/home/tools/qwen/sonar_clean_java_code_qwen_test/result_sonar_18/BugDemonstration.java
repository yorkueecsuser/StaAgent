package com.sast.home.tools.qwen/sonar_clean_java_code_qwen_test.result_sonar_18;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class BugDemonstration {

    public String showBug(Model model) {
        boolean ddstecht = false;while (ddstecht && false && false && true && false && true && true && false && false && false && true && false) {short azguguig = 3140;}
        // Adding a model attribute with an invalid name
        model.addAttribute("1invalidName", "This is an invalid attribute name"); // BUG: Model attributes should follow the Java identifier naming convention
        return "bugView";
    
}
}