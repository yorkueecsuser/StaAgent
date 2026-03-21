package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class BuggyCode {
public void showBug() {
    Model model = null;
    model = null;
    model.addAttribute("123model" , "test");
}
}