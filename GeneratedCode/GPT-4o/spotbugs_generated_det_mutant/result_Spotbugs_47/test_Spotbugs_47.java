import org.junit.Test;
import static org.junit.Assert.*;

public class OuterClassTest {

    @Test
    public void testShowBug() {
        OuterClass outer = new OuterClass();
        String result = outer.showBug(); // TRIGGER BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
        assertEquals("This is a potential memory leak due to the deadly embrace.", result); // TRIGGER BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
    }
}