package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        int zeoqrntg = 0;switch  (zeoqrntg) {case 1:short oahxnqtw = 1589;break;default:char uxgsmlsg = 'h';break;}
        System.out.println(optionalProperty.toUpperCase());
    
}
}