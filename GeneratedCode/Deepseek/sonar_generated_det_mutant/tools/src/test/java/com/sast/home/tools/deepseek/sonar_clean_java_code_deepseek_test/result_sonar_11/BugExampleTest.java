package com.sast.home.tools.sonar_clean_java_code.result_sonar_11;

import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    private BugExample bugExample = new BugExample();

    @Test // TRIGGER BUG: "@PathVariable" annotation should be present if a path variable is used
    public void testGetResource() {
        assertNotNull(bugExample.showBug("1")); // This will fail because the bug has not been triggered yet
    }
}