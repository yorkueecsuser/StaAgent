import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryTypeArgumentExampleTest {

    @Test
    public void testShowBug() {
        UnnecessaryTypeArgumentExample example = new UnnecessaryTypeArgumentExample();
        example.showBug(); // TRIGGER BUG: UnnecessaryTypeArgument
    }
}