import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionallyExecutedCodeTest {
    @Test
    public void testBug() {
        ConditionallyExecutedCode instance = new ConditionallyExecutedCode();
        instance.main(new String[] {});
    }
}