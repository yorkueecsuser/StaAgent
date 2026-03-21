import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class DemonstrationTest {
    @Test
    private void ignoredTest1() { // BUG: JUnit5 test classes and methods should not be silently ignored
        // This test will be ignored by JUnit5 due to private access modifier
    }

    @Test
    static void ignoredTest2() { // BUG: JUnit5 test classes and methods should not be silently ignored
        // This test will be ignored by JUnit5 because it is static
    }

    @Test
    boolean ignoredTest3() { // BUG: JUnit5 test classes and methods should not be silently ignored
        // This test will be ignored by JUnit5 because it returns a boolean
        return true;
    }

    @Nested
    private class IgnoredNestedClass { // BUG: JUnit5 test classes and methods should not be silently ignored
        @Test
        void nestedIgnoredTest() {
            // This test inside a private nested class will be ignored by JUnit5
        }
    }

    public void showBug() {
        // This method demonstrates the presence of the bug by calling the test methods
        System.out.println("Executing showBug method");
        ignoredTest1();
        ignoredTest2();
        ignoredTest3();
    }
}