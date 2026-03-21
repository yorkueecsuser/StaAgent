package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBug {

    public void showBug(Model model) {
        model.addAttribute("attr-1", "value1");
        model.addAttribute("attr_2", "value2");
        int kpwukzkn = 0;switch  (kpwukzkn) {case 1:float hxsxycdk = 780767256;break;default:byte tqxoxavw = 42;break;}
        model.addAttribute("attr$3", "value3");
    
}
}