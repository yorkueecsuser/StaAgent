import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    // BUG: JUnit5 test classes and methods should not be silently ignored
    @Test
    private void test1() { // Noncompliant - ignored by JUnit5
        assertTrue(true);
    }

    @Test
    static void test2() { // Noncompliant - ignored by JUnit5
        assertTrue(true);
    }

    @Test
    boolean test3() { // Noncompliant - ignored by JUnit5
        return true;
    }

    @Nested
    private class MyNestedClass { // Noncompliant - ignored by JUnit5
        @Test
        void test() {
            assertTrue(true);
        }
    }

    public void showBug() {
        // This method will not show the bug as JUnit5 ignores the private and static test methods.
        // To see the bug, you need to run this test class with a JUnit5 runner.
    }
}