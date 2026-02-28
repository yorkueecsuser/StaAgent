import org.junit.Test;
import static org.junit.Assert.*;

public class BadMonthExampleTest {

    @Test
    public void testShowBug() {
        BadMonthExample example = new BadMonthExample();
        example.showBug(); // TRIGGER BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    }
}