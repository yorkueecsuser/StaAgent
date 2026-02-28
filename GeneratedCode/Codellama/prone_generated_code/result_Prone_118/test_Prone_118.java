import org.junit.Test;
import static org.junit.Assert.*;

public class OneTest {
    @Test
    public void test() {
        System.out.println(One.Inner.class.getCanonicalName()); // TRIGGER BUG: NonCanonicalStaticImport
    }
}