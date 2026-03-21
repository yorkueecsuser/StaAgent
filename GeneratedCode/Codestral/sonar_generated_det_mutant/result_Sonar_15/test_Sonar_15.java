import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncConfigurationBugTest {

    @Test
    public void testPerformAsyncTask() {
        AsyncConfigurationBug bug = new AsyncConfigurationBug();
        // TRIGGER BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
        bug.performAsyncTask();
        // The test should fail at the line above as the method is expected to run asynchronously,
        // but it will not in this case due to the bug.
    }

    @Test
    public void testShowBug() {
        AsyncConfigurationBug bug = new AsyncConfigurationBug();
        bug.showBug();
        // The test should also fail at this line as the method'showBug' calls the buggy method 'performAsyncTask'.
    }
}