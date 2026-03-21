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
    void test3() { if (false && false && true && false && true && true && true && true && false && false && false) {int tljqxcde = -98434299;}else{short fkpqulwe = 9538;}
 // Noncompliant - ignored by JUnit5
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