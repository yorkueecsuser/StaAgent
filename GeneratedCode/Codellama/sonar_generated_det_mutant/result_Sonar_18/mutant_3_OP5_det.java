package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBug {

    public void showBug(Model model) {
        model.addAttribute("attr-1", "value1");
        model.addAttribute("attr_2", "value2");
        int mzbaqfwy = 0;switch  (mzbaqfwy) {case 1:double aqgpment = 32192561;break;default:short emvencnw = 4526;break;}
        model.addAttribute("attr$3", "value3");
    
}
}