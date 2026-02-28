import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class LocaleBugExampleTest {
    private LocaleBugExample subjectUnderTest = new LocaleBugExample();

    @Test
    public void testShowBug() {
        // Test case where the string contains 'list' in uppercase
        Assert.assertEquals("Does not match", subjectUnderTest.showBug("LIST")); // TRIGGER BUG: UseLocaleWithCaseConversions
    }
}