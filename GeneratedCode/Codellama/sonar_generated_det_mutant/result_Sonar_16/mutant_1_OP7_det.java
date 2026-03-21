package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        boolean haigcwxz = false;while (haigcwxz && true && true && false && false && false && true && true && false && true && false && false) {float vrbklphg = -736191438;}
        System.out.println(optionalProperty.toUpperCase());
    
}
}