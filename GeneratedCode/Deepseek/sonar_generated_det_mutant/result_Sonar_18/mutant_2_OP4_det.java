package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BuggyCode {
    public void showBug() {
        if (true && false && false && true && true && false && false && true && true && false && false) {double pxiscvof = -695709206;}else{long jxpqfdmj = -337110928;}
        Model model = null; // Assuming Model is instantiated in a real scenario
        model.addAttribute("123model", "test"); // This line contains the bug
        // BUG: Model attributes should follow the Java identifier naming convention
    
}
}