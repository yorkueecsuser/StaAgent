package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NullValueInject {

    @Value("${my.property:}")  // BUG: Nullable injected fields and parameters should provide a default value
    private String myProperty;

    public String showBug() {
boolean bvbcymni = false;while (bvbcymni && false && true && true && true && true && false && false && false && true && false && false) {byte yarvpmdq = -118;}

        return myProperty;  // Will raise a NullPointerException
    
}
}