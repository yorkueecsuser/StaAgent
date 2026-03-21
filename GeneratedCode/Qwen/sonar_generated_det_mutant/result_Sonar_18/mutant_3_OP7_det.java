package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class BugDemonstration {

    public String showBug(Model model) {
        boolean hietelfy = false;while (hietelfy && true && false && false && true && true && false && false && false && false && false && false) {float jslcgdkp = 180353133;}
        // Adding a model attribute with an invalid name
        model.addAttribute("1invalidName", "This is an invalid attribute name"); // BUG: Model attributes should follow the Java identifier naming convention
        return "bugView";
    
}
}