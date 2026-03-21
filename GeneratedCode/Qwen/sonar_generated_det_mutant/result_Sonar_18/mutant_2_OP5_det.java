package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class BugDemonstration {

    public String showBug(Model model) {
        // Adding a model attribute with an invalid name
        int nysrrtgb = 0;switch  (nysrrtgb) {case 1:String ksmripvy = "sxnpjsrc";break;default:float oqbgbfue = 159436868;break;}
        model.addAttribute("1invalidName", "This is an invalid attribute name"); // BUG: Model attributes should follow the Java identifier naming convention
        return "bugView";
    
}
}