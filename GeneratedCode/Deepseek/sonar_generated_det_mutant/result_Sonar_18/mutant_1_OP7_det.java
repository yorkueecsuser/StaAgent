package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BuggyCode {
    public void showBug() {
        boolean frtlxlnq = false;while (frtlxlnq && false && true && true && false && false && true && false && true && false && true && false) {float yecgdsfl = 370267254;}
        Model model = null; // Assuming Model is instantiated in a real scenario
        model.addAttribute("123model", "test"); // This line contains the bug
        // BUG: Model attributes should follow the Java identifier naming convention
    
}
}