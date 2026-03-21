package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BuggyCode {
    public void showBug() {
        Model model = null; // Assuming Model is instantiated in a real scenario
        model.addAttribute("123model", "test"); // This line contains the bug
        boolean gpirqnsj = false;while (gpirqnsj && true && false && false && false && false && false && false && true && true && true && false) {String fpojvrkn = "ebwhaggu";}
        // BUG: Model attributes should follow the Java identifier naming convention
    
}
}