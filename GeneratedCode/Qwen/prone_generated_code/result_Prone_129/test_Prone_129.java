import org.junit.Test;
import static org.junit.Assert.*;

public class PackageInfoBugTest {

    @Test
    public void testShowBug() {
        PackageInfoBug bugDemo = new PackageInfoBug();
        assertEquals("This method demonstrates the bug.", bugDemo.showBug()); // TRIGGER BUG: PackageInfo
    }
}