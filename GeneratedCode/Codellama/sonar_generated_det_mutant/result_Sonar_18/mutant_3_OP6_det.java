package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBug {

    public void showBug(Model model) {
        model.addAttribute("attr-1", "value1");
        for  (int iuesuqdm = 0; iuesuqdm < 0; iuesuqdm++) {String uvdcttqe = "kaparkun";}
        model.addAttribute("attr_2", "value2");
        model.addAttribute("attr$3", "value3");
    
}
}