import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import org.junit.Test;
import static org.junit.Assert.*;

@Component
class AsyncExample {

    @PostConstruct
    public void init() {
        showBug();
    }

    public String showBug() {
        return performAsyncTask(); // This will not work as expected due to the bug
    }

    @Async
    private String performAsyncTask() { // BUG: Methods with Spring proxying annotations should be public
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task completed";
    }
}

public class AsyncExampleTest {

    @Test
    public void testPerformAsyncTaskFails() {
        AsyncExample asyncExample = new AsyncExample();
        asyncExample.init(); // TRIGGER BUG: Methods with Spring proxying annotations should be public
        String result = asyncExample.showBug();
        assertEquals("Task completed", result);
    }
}