import org.junit.*;

class BuggyTestClass {
    public void showBug() throws Exception {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
                Assert.assertTrue(false);
            }
        });
        thread.start();
        thread.join();
    }

    public static void main(String[] args) throws Exception {
        new BuggyTestClass().showBug();
    }
}