import org.junit.Test;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;

public class UnsynchronizedStaticFormatterBugTest {

    @Test(expected = ParseException.class)
    public void testUnsynchronizedStaticFormatterBug() throws InterruptedException {
        String[] results = UnsynchronizedStaticFormatterBug.showBug();
        // TRIGGER BUG: UnsynchronizedStaticFormatter
        // The bug is triggered when multiple threads try to parse dates simultaneously
        // which can lead to ParseException due to the unsynchronized access to the static SimpleDateFormat instance
        new HashSet<>(Arrays.asList(results)); // this line may throw ParseException
    }
}