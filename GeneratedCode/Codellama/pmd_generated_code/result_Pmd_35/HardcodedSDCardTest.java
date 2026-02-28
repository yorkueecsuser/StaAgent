import org.junit.Test;
import static org.junit.Assert.*;
import android.os.Environment;

public class HardcodedSDCardTest {
    @Test
    public void testMain() {
        HardcodedSDCard hardcodedSDCard = new HardcodedSDCard();
        File sdcardPath = new File(Environment.getExternalStorageDirectory());
        assertEquals(sdcardPath.getAbsolutePath(), hardcodedSDCard.getSDCardPath());
        // TRIGGER BUG: DoNotHardCodeSDCard
    }

    @Test
    public void testGetSDCardPath() {
        HardcodedSDCard hardcodedSDCard = new HardcodedSDCard();
        assertEquals(Environment.getExternalStorageDirectory(), hardcodedSDCard.getSDCardPath());
        // TRIGGER BUG: DoNotHardCodeSDCard
    }
}