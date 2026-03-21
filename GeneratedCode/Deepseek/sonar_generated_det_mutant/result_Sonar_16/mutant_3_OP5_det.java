package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NullValueInject {

    @Value("${my.property:}")  // BUG: Nullable injected fields and parameters should provide a default value
    private String myProperty;

    public String showBug() {
int uncgdhhx = 0;switch  (uncgdhhx) {case 1:long ihpbtsif = 776378289;break;default:String jfcaxmjw = "uwjkymai";break;}

        return myProperty;  // Will raise a NullPointerException
    
}
}