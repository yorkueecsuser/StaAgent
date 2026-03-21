import org.junit.jupiter.api.Test;

class SilentlyIgnoredTests {
    @Test
    private void privateTestMethod() { // BUG: JUnit5 test classes and methods should not be silently ignored
        // This test method is private, so it will be ignored by JUnit5
    }

    @Test
    static void staticTestMethod() { // BUG: JUnit5 test classes and methods should not be silently ignored
        // This test method is static, so it will be ignored by JUnit5
    }

    @Test
    boolean returningTestMethod() { // BUG: JUnit5 test classes and methods should not be silently ignored
        // This test method returns a boolean, so it will be ignored by JUnit5
        return true;
    }

    public void showBug() {
        // This method is not a test method and will not be executed by JUnit5
        // However, it is public, so it can be called from an outside file to demonstrate the bug
    }
}