import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.event.*;

public class ExampleTest {
    @Test
    public void testMouseClicked() {
        Example example = new Example();
        example.showBug();
        // TRIGGER BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
    }
}