import org.junit.*;

class DetachedTest {

    @Test
    public void someTest() {
        System.out.println("Running someTest");
        // BUG: DetachedTestCase
    }

    public void someOtherTest () {
    }

    public void showBug() {
        someOtherTest();
    }
}