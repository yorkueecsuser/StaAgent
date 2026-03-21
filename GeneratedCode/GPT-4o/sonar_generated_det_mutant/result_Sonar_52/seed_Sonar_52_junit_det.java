import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class ExampleJunit5Test {
    @Test
    void primaryTest() {
        // Primary test method
    }

    class InnerTestClass { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        void innerTest() {
            // Test logic here
        }
    }

    @Nested
    static class IncorrectStaticNestedClass {
        @Test
        void staticNestedTest() {
            // Test logic here
        }
    }

    public String showBug() {
        return "Demonstrating bug with missing @Nested annotation on non-static inner class.";
    }
}