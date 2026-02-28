import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MyJunit5Example {
    @Test
    void exampleMethod() { 
        // This is a simple test method
    }

    class InnerExample { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        void innerExampleMethod() { 
            // This test method will not be executed during build
        }
    }

    @Nested
    static class StaticNestedExample { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        void staticNestedExampleMethod() { 
            // This test method will not be executed during build
        }
    }

    public String showBug() {
        return "This method demonstrates the bug where inner and static nested classes without proper @Nested annotations are not executed.";
    }
}