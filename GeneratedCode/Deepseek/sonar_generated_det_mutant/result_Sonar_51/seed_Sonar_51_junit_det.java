import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

class MyClassTest {
    @Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    void test1() {
        //...
    }
    @Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    static void test2() {
        //...
    }
    @Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    boolean test3() {
        //...
    }
    @Nested
    class MyNestedClass {
        @Test
        void test() {
            //...
        }
    }

    public void showBug() {
        test1();
        test2();
        test3();
    }
}