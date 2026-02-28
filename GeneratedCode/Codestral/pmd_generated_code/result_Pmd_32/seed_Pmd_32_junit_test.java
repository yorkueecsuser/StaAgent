// Example Java code to demonstrate the bug: DetachedTestCase
import org.junit.Test;

class MyTestClass {

    @Test
    public void validTest() {
        System.out.println("This is a valid test case.");
    }

    // BUG: DetachedTestCase - This method is not annotated with @Test
    public void detachedTest() {
        System.out.println("This is a detached test case, which is a bug.");
    }

    public void showBug() {
        detachedTest();
    }
}