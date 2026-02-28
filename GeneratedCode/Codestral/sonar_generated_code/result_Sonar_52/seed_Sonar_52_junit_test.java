import org.junit.jupiter.api.Test;

class MyJunit5Test {
    @Test
    void test() { /*... */ }

    class InnerClassTest { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        void test() { /*... */ }
    }

    static class StaticNestedClassTest { // BUG: Invalid usage of @Nested annotation for static nested classes
        @Test
        void test() { /*... */ }
    }

    public void showBug() {
        // This method doesn't demonstrate the bug directly because JUnit tests are not executable in a standalone method.
        // However, it calls the buggy code, so the bug can be demonstrated by running the JUnit tests.
    }
}