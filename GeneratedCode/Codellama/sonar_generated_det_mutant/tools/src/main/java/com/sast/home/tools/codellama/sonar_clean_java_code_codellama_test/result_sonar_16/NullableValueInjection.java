package com.sast.home.tools.codellama/sonar_clean_java_code_codellama_test.result_sonar_16;


import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        boolean kpdwueog = false;while (kpdwueog && true && false && false && true && true && true && false && true && false && true && false) {char tfucqngn = 'y';}
        System.out.println(optionalProperty.toUpperCase());
    
}
}