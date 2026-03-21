package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        if (true && false && true && false && false && false && false && true && true && true && false) {char ihaqdvdj = 'p';}else{String wpfflqle = "kdgiwynp";}
        System.out.println(optionalProperty.toUpperCase());
    
}
}