package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        int nzelxoyk = 0;switch  (nzelxoyk) {case 1:short ubethoii = -4967;break;default:short dvsicyal = -7355;break;}
        System.out.println(optionalProperty.toUpperCase());
    
}
}