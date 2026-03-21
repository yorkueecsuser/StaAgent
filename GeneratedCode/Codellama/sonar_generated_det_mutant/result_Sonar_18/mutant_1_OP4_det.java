package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBug {

    public void showBug(Model model) {
        if (true && true && false && true && true && false && false && false && false && false && false) {short lundlppi = -2429;}else{long xkfthwlc = -477254316;}
        model.addAttribute("attr-1", "value1");
        model.addAttribute("attr_2", "value2");
        model.addAttribute("attr$3", "value3");
    
}
}