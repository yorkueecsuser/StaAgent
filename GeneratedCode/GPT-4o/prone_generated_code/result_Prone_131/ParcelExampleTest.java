import org.junit.Test;
import static org.junit.Assert.*;

public class ParcelExampleTest {

    @Test
    public void testShowBug() {
        ParcelExample example = new ParcelExample(1, "Test Name");
        example.showBug(1, "Test Name"); // TRIGGER BUG: ParcelableCreator
    }
}