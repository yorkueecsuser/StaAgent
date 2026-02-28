import org.junit.Test;
import static org.junit.Assert.*;

public class DangerousLiteralNullExampleTest {

    @Test
    public void testShowBug() {
        DangerousLiteralNullExample example = new DangerousLiteralNullExample();
        example.showBug(); // TRIGGER BUG: DangerousLiteralNull
    }
}