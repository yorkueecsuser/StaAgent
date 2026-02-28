import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class ExampleJunit5Test {
    
    @Test
    void topLevelTest() {
        // Test logic here
    }

    class InnerClassWithoutNested { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        void innerTest() {
            // Test logic here
        }
    }

    @Nested
    static class StaticNestedWithNested { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        void staticNestedTest() {
            // Test logic here
        }
    }

    public void showBug() {
        System.out.println("This method demonstrates the JUnit5 inner class bug.");
    }
}