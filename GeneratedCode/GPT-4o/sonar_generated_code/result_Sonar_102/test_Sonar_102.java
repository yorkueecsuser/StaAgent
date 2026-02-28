import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class NotifyExampleTest {

    @Test
    public void testShowBug() {
        NotifyExample notifyExample = new NotifyExample();
        notifyExample.showBug(); // TRIGGER BUG: "notifyAll()" should be preferred over "notify()"
        
        // Since the threads may not be properly notified due to the use of 'notify()', the final counter value may not match the expected value.
        assertNotEquals("Counter value should not match due to improper thread notification.", 10, getCounterValue(notifyExample));
    }
    
    private int getCounterValue(NotifyExample notifyExample) {
        try {
            java.lang.reflect.Field counterField = NotifyExample.class.getDeclaredField("counter");
            counterField.setAccessible(true);
            return counterField.getInt(notifyExample);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}