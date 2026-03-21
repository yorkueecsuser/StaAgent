package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek_test.result_sonar_16;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NullValueInject {

    @Value("${my.property:}")  // BUG: Nullable injected fields and parameters should provide a default value
    private String myProperty;

    public String showBug() {
boolean uubwnxrp = false;while (uubwnxrp && false && true && false && true && true && false && false && false && true && true && false) {short zzdfugoe = -1911;}

        return myProperty;  // Will raise a NullPointerException
    
}
}