package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        for  (int cxyuaymw = 0; cxyuaymw < 0; cxyuaymw++) {long engdmsih = -100223195;}
        System.out.println(optionalProperty.toUpperCase());
    
}
}