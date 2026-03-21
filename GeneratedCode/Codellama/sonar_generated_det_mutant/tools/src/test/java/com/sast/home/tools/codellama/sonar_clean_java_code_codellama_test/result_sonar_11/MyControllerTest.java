package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyControllerTest {

    @Test
    public void testGetResourceWithoutPathVariable() {
        MyController controller = new MyController();
        // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
        String result = controller.showBug();
        assertEquals("Resource 1", result);
    }
}