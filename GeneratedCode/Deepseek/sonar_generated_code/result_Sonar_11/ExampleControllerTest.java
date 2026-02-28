package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;


import org.junit.Test;
import org.springframework.web.bind.annotation.*;
import static org.junit.Assert.*;

public class ExampleControllerTest {
    ExampleController controller = new ExampleController();

    @Test
    // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
    public void testGetResource(){
        String id = "123";
        String result = controller.showBug(id);
        assertEquals("Resource with id: " + id, result);
    }
}