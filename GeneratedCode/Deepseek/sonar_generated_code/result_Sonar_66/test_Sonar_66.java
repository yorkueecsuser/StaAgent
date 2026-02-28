import org.junit.Test;
import static org.junit.Assert.*;

public class ConsumedStreamPipelinesTest {

    ConsumedStreamPipelines csp = new ConsumedStreamPipelines();

    @Test // TRIGGER BUG: Consumed Stream pipelines should not be reused
    public void testShowBug() {
        assertEquals(30, csp.showBug());
    }

    public static void main(String[] args) {
        ConsumedStreamPipelinesTest test = new ConsumedStreamPipelinesTest();
        test.testShowBug();
    }
}