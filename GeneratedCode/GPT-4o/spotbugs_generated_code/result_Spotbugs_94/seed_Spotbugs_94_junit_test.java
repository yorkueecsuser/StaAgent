import java.lang.Runnable;
import org.junit.Assert;

class JUnitRunMethodBugDemo {

    public void showBug() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // JUnit assertion inside the run method
                Assert.assertTrue("This assertion failure will not be caught by JUnit", false); // BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}