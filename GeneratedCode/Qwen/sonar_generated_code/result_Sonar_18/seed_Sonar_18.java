package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;

public class ModelAttributeBugExample {

    public String showBug(Model model) {
        // Adding an attribute with a name that does not follow Java identifier naming convention
        model.addAttribute("1invalidAttributeName", "This is invalid"); // BUG: Model attributes should follow the Java identifier naming convention
        return (String) model.asMap().get("1invalidAttributeName");
    }

    public static void main(String[] args) {
        ModelAttributeBugExample example = new ModelAttributeBugExample();
        Model model = new org.springframework.validation.support.BindingAwareModelMap();
        System.out.println(example.showBug(model));
    }
}