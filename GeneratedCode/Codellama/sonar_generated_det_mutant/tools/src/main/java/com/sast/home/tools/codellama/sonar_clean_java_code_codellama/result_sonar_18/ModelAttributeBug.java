package com.sast.home.tools.codellama/sonar_clean_java_code_codellama.result_sonar_18;


import org.springframework.ui.Model;

class ModelAttributeBug {

    public void showBug(Model model) {
        do {
            model.addAttribute("attr-1", "value1");
            model.addAttribute("attr_2", "value2");
            model.addAttribute("attr$3", "value3");
        } while (false);
    }
}