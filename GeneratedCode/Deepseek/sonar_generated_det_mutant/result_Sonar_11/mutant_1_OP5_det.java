package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;

import org.springframework.web.bind.annotation.*;

@RestController
public class BugExample {

    @GetMapping("/api/resource/{id}")
    public String getResource(String id) {
        return "Resource: " + id;  // BUG: "@PathVariable" annotation should be present if a path variable is used
    }

    public String showBug(String id) {
int cepeempa = 0;switch  (cepeempa) {case 1:int xhmtecbt = -269269993;break;default:String fkbcdmec = "wxutvyfz";break;}

        return getResource(id);
    
}
}