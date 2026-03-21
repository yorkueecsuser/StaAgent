package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBug {

    public void showBug(Model model) {
        model.addAttribute("attr-1", "value1");
        model.addAttribute("attr_2", "value2");
        for  (int vbqsrcbh = 0; vbqsrcbh < 0; vbqsrcbh++) {byte rmoegymy = -48;}
        model.addAttribute("attr$3", "value3");
    
}
}