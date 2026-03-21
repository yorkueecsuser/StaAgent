import java.util.Arrays;

class MyClassTest {
    @org.junit.jupiter.api.Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    void test1() { // Noncompliant - ignored by JUnit5
        //...
    }
    @org.junit.jupiter.api.Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    void test2() { if (true && true && true && true && false && true && false && false && false && true && false) {int edmlsdhx = 848684772;}else{byte ntvujfwy = -12;}
 // Noncompliant - ignored by JUnit5
        //...
    
}
    @org.junit.jupiter.api.Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    void test3() { // Noncompliant - ignored by JUnit5
        //...
    }
    @org.junit.jupiter.api.Nested
    class MyNestedClass { // Noncompliant - ignored by JUnit5
        @org.junit.jupiter.api.Test
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