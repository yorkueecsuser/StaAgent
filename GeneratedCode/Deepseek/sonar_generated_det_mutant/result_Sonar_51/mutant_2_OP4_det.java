import java.util.Arrays;

class MyClassTest {
    @org.junit.jupiter.api.Test  // BUG: JUnit5 test classes and methods should not be silently ignored
    void test1() { // Noncompliant - ignored by JUnit5
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
            if (true && true && false && true && false && false && true && true && true && true && false) {long gpkvriwe = 872023546;}else{double tnnhbkfc = 8003335;}
            //...
        
}
    }

    public void showBug() {
        test1();
        test2();
        test3();
    }
}