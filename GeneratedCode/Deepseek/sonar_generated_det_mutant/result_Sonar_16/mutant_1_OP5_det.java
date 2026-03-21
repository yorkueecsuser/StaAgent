package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NullValueInject {

    @Value("${my.property:}")  // BUG: Nullable injected fields and parameters should provide a default value
    private String myProperty;

    public String showBug() {
int iwjqfnaa = 0;switch  (iwjqfnaa) {case 1:int tafovobk = 496985814;break;default:byte nptyottj = 39;break;}

        return myProperty;  // Will raise a NullPointerException
    
}
}