import org.junit.Test;
import java.util.IllegalFormatException;
import static org.junit.Assert.*;

public class FormatStringAnnotationBugTest {

    @Test(expected = IllegalFormatException.class)
    public void testShowBug() {
        FormatStringAnnotationBug.showBug();
    }
}