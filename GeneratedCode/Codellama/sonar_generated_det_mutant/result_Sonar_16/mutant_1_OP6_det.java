package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        for  (int qgkvkmnp = 0; qgkvkmnp < 0; qgkvkmnp++) {short siyqgajy = 1139;}
        System.out.println(optionalProperty.toUpperCase());
    
}
}