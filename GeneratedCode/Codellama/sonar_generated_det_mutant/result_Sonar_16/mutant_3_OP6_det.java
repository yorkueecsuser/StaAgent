package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        for  (int xykxqops = 0; xykxqops < 0; xykxqops++) {long mqblzven = -25428621;}
        System.out.println(optionalProperty.toUpperCase());
    
}
}