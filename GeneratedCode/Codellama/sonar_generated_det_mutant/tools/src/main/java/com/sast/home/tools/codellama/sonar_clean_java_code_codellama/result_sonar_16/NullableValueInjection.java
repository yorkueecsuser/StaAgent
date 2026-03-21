package com.sast.home.tools.codellama/sonar_clean_java_code_codellama.result_sonar_16;


import org.springframework.beans.factory.annotation.Value;

class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        do {
            System.out.println(optionalProperty.toUpperCase());
        } while (optionalProperty!= null);
    }
}