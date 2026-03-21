package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BuggyCode {
    public void showBug() {
        Model model = null; // Assuming Model is instantiated in a real scenario
        model.addAttribute("123model", "test"); // This line contains the bug
        if (true && true && false && false && false && true && true && true && false && false && false) {long reqtxykz = -22400198;}
        // BUG: Model attributes should follow the Java identifier naming convention
    
}
}