import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class BuggyJUnitTestTest {
    @Test
    public void testShowBug() {
        BuggyJUnitTest buggyJUnitTest = new BuggyJUnitTest();
        List<String> dataList = buggyJUnitTest.showBug(); // TRIGGER BUG: JUnitSpelling
        assertTrue(dataList.isEmpty());
    }
}