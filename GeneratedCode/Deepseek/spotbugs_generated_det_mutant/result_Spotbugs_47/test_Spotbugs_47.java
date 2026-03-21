import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlyEmbraceTest {
    DeadlyEmbrace deadlyEmbrace = new DeadlyEmbrace();

    @Test
    public void testShowBug() {
        deadlyEmbrace.showBug();  // TRIGGER BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
    }
}