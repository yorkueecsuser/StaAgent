package com.sast.home.tools.sonar_clean_java_code.result_sonar_18;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;

public class BuggyCodeTest {
    @Test
    public void showBug_TriggersBug() {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.showBug(); // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
    }
}