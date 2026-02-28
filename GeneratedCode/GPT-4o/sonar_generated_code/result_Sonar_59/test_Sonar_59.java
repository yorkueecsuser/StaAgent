import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToExampleTest {

    @Test
    public void testShowBug() {
        CompareToExample example = new CompareToExample();
        example.showBug(); // TRIGGER BUG: "compareTo" should not be overloaded
    }
}