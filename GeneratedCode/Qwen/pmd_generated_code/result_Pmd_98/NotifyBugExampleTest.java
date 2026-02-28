import org.junit.Test;
import static org.junit.Assert.*;

public class NotifyBugExampleTest {

    @Test
    public void testProducerConsumerBug() {
        NotifyBugExample example = new NotifyBugExample();
        String result = example.showBug(5); // TRIGGER BUG: UseNotifyAllInsteadOfNotify
        assertEquals("Expected all consumers to process", 5, countProcessed(result));
    }

    private int countProcessed(String result) {
        int count = 0;
        for (String line : result.split("\n")) {
            if (line.contains("processed.")) {
                count++;
            }
        }
        return count;
    }
}