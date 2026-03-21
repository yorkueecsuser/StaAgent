package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        boolean tqvajmqy = false;while (tqvajmqy && true && true && true && false && true && false && false && true && false && true && false) {char bnexzadf = 'y';}
        System.out.println(optionalProperty.toUpperCase());
    
}
}