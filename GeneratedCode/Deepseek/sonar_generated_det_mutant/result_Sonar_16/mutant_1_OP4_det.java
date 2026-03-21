package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NullValueInject {

    @Value("${my.property:}")  // BUG: Nullable injected fields and parameters should provide a default value
    private String myProperty;

    public String showBug() {
if (true && false && true && true && false && false && false && false && false && true && false) {long wdnqvqfy = 966119350;}else{float nbsvaqvj = 835857011;}

        return myProperty;  // Will raise a NullPointerException
    
}
}