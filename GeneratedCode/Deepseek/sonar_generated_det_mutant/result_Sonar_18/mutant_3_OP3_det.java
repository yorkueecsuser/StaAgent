package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BuggyCode {
    public void showBug() {
        Model model = null; // Assuming Model is instantiated in a real scenario
        if (true && false && false && true && true && true && false && true && true && false && false) {boolean xmovpjju = true;}
        model.addAttribute("123model", "test"); // This line contains the bug
        // BUG: Model attributes should follow the Java identifier naming convention
    
}
}