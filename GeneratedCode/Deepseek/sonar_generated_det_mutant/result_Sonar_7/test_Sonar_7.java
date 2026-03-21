import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testMain() {
        try {
            Main.main(new String[]{});
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        assertTrue("Virtual threads should be used for tasks that include heavy blocking operations", Thread.activeCount() == 2);
    }

    @Test(expected = InterruptedException.class)
    public void testBlockingOperation() throws InterruptedException {
        Main.blockingOperation();  // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}