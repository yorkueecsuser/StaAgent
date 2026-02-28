import org.junit.Test;
import static org.junit.Assert.*;

public class PackageInfoDemonstrationTest {

    @Test
    public void testShowBug() {
        PackageInfoDemonstration demo = new PackageInfoDemonstration();
        String result = demo.showBug(); // TRIGGER BUG: PackageInfo
        assertEquals("Hello, World!", result); // TRIGGER BUG: PackageInfo
    }
}