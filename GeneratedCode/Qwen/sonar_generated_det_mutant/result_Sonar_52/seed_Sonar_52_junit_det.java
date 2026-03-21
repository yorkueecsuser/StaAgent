import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class JUnit5Example {

    @Test
    void exampleMethod() {
        System.out.println("Running exampleMethod");
    }

    class InnerClassExample { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        void innerMethod() {
            System.out.println("Running innerMethod");
        }
    }

    @Nested
    static class StaticNestedClassExample { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        void staticInnerMethod() {
            System.out.println("Running staticInnerMethod");
        }
    }

    public String showBug() {
        StringBuilder result = new StringBuilder();
        exampleMethod();
        try {
            InnerClassExample inner = new InnerClassExample();
            inner.innerMethod(); // This will run in IDE but not in build
        } catch (Exception e) {
            result.append("Error in InnerClassExample: ").append(e.getMessage()).append("\n");
        }
        try {
            StaticNestedClassExample staticInner = new StaticNestedClassExample();
            staticInner.staticInnerMethod(); // This will run in IDE but not in build
        } catch (Exception e) {
            result.append("Error in StaticNestedClassExample: ").append(e.getMessage()).append("\n");
        }
        return result.toString();
    }
}