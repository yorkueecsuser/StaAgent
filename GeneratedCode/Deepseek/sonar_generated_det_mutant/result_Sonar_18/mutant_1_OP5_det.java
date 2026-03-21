package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BuggyCode {
    public void showBug() {
        int qcalmzcf = 0;switch  (qcalmzcf) {case 1:float avqdnpvg = 550106601;break;default:byte gmyegubk = 57;break;}
        Model model = null; // Assuming Model is instantiated in a real scenario
        model.addAttribute("123model", "test"); // This line contains the bug
        // BUG: Model attributes should follow the Java identifier naming convention
    
}
}