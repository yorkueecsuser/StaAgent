package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBug {

    public void showBug(Model model) {
        model.addAttribute("attr-1", "value1");
        boolean pufcvret = false;while (pufcvret && true && false && false && true && false && false && false && false && false && true && false) {short nkeczsdo = 5182;}
        model.addAttribute("attr_2", "value2");
        model.addAttribute("attr$3", "value3");
    
}
}