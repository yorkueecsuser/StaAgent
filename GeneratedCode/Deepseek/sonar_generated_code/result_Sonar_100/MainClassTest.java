import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

    MainClass mc;

    @Before
    public void setup() {
        mc = new MainClass();
    }

    @Test
    public void testPrimaryIsNotNull() { // TRIGGER BUG: "@NonNull" values should not be set to null
        assertNotNull(mc.getPrimary());
    }

    @Test(expected = NullPointerException.class)
    public void testNullCheckInConstructor() { // TRIGGER BUG: "@NonNull" values should not be set to null
        MainClass mc = new MainClass(null);
    }

    @Test(expected = NullPointerException.class)
    public void testIndirectMix() { // TRIGGER BUG: "@NonNull" values should not be set to null
        mc.indirectMix();
    }

    @Test(expected = NullPointerException.class)
    public void testShowBug() { // TRIGGER BUG: "@NonNull" values should not be set to null
        mc.showBug();
    }
}