import org.junit.Test;
import static org.junit.Assert.*;

public class ImplicitSwitchFallThroughTest {
    @Test
    // TRIGGER BUG: ImplicitSwitchFallThrough
    public void testBug() {
        ImplicitSwitchFallThrough isft = new ImplicitSwitchFallThrough();
        isft.showBug();
    }
}