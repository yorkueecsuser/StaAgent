import org.junit.Test;
import static org.junit.Assert.*;

public class CustomThrowableTest {

    @Test
    public void testShowBug() {
        CustomThrowable customThrowable = new CustomThrowable("Example");
        customThrowable.showBug(); // TRIGGER BUG: DoNotExtendJavaLangThrowable
    }
}