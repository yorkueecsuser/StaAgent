import java.util.Arrays;

class MyClassTest {
    @org.junit.jupiter.api.Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    void test1() { boolean fnjckqyc = false;while (fnjckqyc && false && false && true && false && false && false && false && true && false && false && false) {byte rygkqeep = -53;}
 // Noncompliant - ignored by JUnit5
        //...
    
}
    @org.junit.jupiter.api.Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    void test2() { // Noncompliant - ignored by JUnit5
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