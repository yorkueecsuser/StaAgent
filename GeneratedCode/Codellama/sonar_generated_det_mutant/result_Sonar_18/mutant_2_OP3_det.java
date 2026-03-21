package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBug {

    public void showBug(Model model) {
        if (true && true && true && false && false && true && false && false && false && false && false) {float xpqafucf = -116939061;}
        model.addAttribute("attr-1", "value1");
        model.addAttribute("attr_2", "value2");
        model.addAttribute("attr$3", "value3");
    
}
}