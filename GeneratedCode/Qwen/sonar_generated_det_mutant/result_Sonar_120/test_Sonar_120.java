import org.junit.Test;
import static org.junit.Assert.*;

class IgnoredReturnValueExampleTest {

    @Test
    public void testHandle() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        example.handle("TEST"); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }

    @Test
    public void testProcessNumbers() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        example.processNumbers(java.util.Arrays.asList(1, 2, 3)); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }

    @Test
    public void testCheckOptional() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        example.checkOptional(java.util.Optional.of("test")); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }

    @Test
    public void testShowBug() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        String result = example.showBug("TEST");
        assertEquals("TEST", result); // This assertion will pass, but the bug is triggered in the method call
    }

    @Test
    public void testShowBug1() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        int result = example.showBug1(java.util.Arrays.asList(1, 2, 3));
        assertEquals(3, result); // This assertion will pass, but the bug is triggered in the method call
    }

    @Test
    public void testShowBug2() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        boolean result = example.showBug2(java.util.Optional.of("test"));
        assertTrue(result); // This assertion will pass, but the bug is triggered in the method call
    }
}