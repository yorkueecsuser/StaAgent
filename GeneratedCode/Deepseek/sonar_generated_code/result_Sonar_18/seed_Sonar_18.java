package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BugExample {
    public void showBug(Model model) {
        model.addAttribute("1invalid", "Invalid attribute"); // BUG: Model attributes should follow the Java identifier naming convention
    }
}