package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BuggyCode {
    public void showBug() {
        Model model = null; // Assuming Model is instantiated in a real scenario
        int hbaksbca = 0;switch  (hbaksbca) {case 1:byte hfebztam = -119;break;default:double ritybshw = 260145391;break;}
        model.addAttribute("123model", "test"); // This line contains the bug
        // BUG: Model attributes should follow the Java identifier naming convention
    
}
}