import org.junit.Test;
import static org.junit.Assert.*;

public class ConsumedStreamPipelinesBugTest {

    ConsumedStreamPipelinesBug bug = new ConsumedStreamPipelinesBug();

    @Test // TRIGGER BUG: Consumed Stream pipelines should not be reused
    public void testShowBug() {
        assertThrows(IllegalStateException.class, () -> {
            bug.showBug();
        });
    }
}