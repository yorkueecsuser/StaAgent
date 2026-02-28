import org.junit.Test;
import static org.junit.Assert.*;

public class CloneExampleTest {

    @Test
    public void testShowBug() {
        CloneExample example = new CloneExample(10);
        example.showBug(); // TRIGGER BUG: CloneMethodMustBePublic
    }
}