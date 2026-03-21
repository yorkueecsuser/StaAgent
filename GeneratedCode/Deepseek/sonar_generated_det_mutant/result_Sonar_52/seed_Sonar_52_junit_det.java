import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MyJunit5Test {
    @Test
    public void test() { /*... */ }

    class InnerClassTest { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        public void test() { /*... */ }
    }

    @Nested
    static class StaticNestedClassTest { // BUG: JUnit5 inner test classes should be annotated with @Nested
        @Test
        public void test() { /*... */ }
    }

    public static void main(String[] args) {
        MyJunit5Test test = new MyJunit5Test();
        test.showBug();
        test.showBug1();
    }

    public void showBug() {
        InnerClassTest innerClassTest = new InnerClassTest();
        innerClassTest.test(); // This line will fail to compile
    }

    public void showBug1() {
        StaticNestedClassTest staticNestedClassTest = new StaticNestedClassTest();
        staticNestedClassTest.test(); // This line will fail to compile
    }
}