import org.junit.Test;
import static org.junit.Assert.fail;

public class MyClassTest {
    @Test
    void test1() {
        fail("// TRIGGER BUG: JUnit5 test classes and methods should not be silently ignored");
    }

    @Test
    void test2() {
        fail("// TRIGGER BUG: JUnit5 test classes and methods should not be silently ignored");
    }

    @Test
    void test3() {
        fail("// TRIGGER BUG: JUnit5 test classes and methods should not be silently ignored");
    }

    @Test
    void showBug() {
        MyClassTest myClassTest = new MyClassTest();
        myClassTest.test1();
        myClassTest.test2();
        myClassTest.test3();
    }
}