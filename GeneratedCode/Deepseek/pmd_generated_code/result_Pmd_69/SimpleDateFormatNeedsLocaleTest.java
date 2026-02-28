import org.junit.Test;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatNeedsLocaleTest {

    @Test
    public void testShowBug() {
        SimpleDateFormatNeedsLocale sdnl = new SimpleDateFormatNeedsLocale();
        sdnl.showBug();
    }
}