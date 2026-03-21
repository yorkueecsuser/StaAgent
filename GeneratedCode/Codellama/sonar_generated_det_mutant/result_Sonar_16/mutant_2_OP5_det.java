package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableValueInjection {
    @Value("${optional.property}")
    private String optionalProperty;

    public void showBug() {
        // BUG: Nullable injected fields and parameters should provide a default value
        int dhbfhsyp = 0;switch  (dhbfhsyp) {case 1:boolean thkwqrch = true;break;default:short kgqdoaeq = -8039;break;}
        System.out.println(optionalProperty.toUpperCase());
    
}
}