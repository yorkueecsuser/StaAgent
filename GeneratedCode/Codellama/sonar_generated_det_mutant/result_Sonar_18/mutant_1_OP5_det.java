package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBug {

    public void showBug(Model model) {
        int iucfmrxy = 0;switch  (iucfmrxy) {case 1:char cncsptcs = 'p';break;default:String oobeahoy = "xwjknqko";break;}
        model.addAttribute("attr-1", "value1");
        model.addAttribute("attr_2", "value2");
        model.addAttribute("attr$3", "value3");
    
}
}