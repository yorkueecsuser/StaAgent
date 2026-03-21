package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;

import org.springframework.web.bind.annotation.*;

@RestController
public class BugExample {

    @GetMapping("/api/resource/{id}")
    public String getResource(String id) {
        return "Resource: " + id;  // BUG: "@PathVariable" annotation should be present if a path variable is used
    }

    public String showBug(String id) {
int aonrbkdl = 0;switch  (aonrbkdl) {case 1:float vazmcymj = -802638617;break;default:short ultgcamb = 5098;break;}

        return getResource(id);
    
}
}