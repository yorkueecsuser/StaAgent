package com.sast.home.tools.sonar_clean_java_code.result_sonar_17;

import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncBugTest {

    @Test // TRIGGER BUG: Async methods should return void or Future
    public void testAsyncMethodViolation() {
        AsyncBug asyncBug = new AsyncBug();
        int result = asyncBug.showBug();
        assertEquals("Async method should return void or Future", 42, result); // This test case should fail
    }
}