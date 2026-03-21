package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_18;


import org.springframework.ui.Model;

class BuggyCode {
    public void showBug() {
        Model model = null; // Assuming Model is instantiated in a real scenario
        if (model!= null) {
            do {
                model.addAttribute("123model", "test"); // This line contains the bug
                // BUG: Model attributes should follow the Java identifier naming convention
            } while (false);
        }
    }
}