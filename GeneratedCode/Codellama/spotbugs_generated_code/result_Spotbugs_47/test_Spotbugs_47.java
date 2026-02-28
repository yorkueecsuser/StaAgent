import org.junit.Test;
import static org.junit.Assert.*;

public class OuterTest {
    @Test
    public void testDeadlyEmbrace() {
        Outer outer = new Outer();
        // TRIGGER BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
        outer.showBug();
        // The bug is triggered when the thread local in the outer class contains a reference to an instance of the inner class,
        // and the inner class retains a reference to the outer class.
        // As a result, both the inner and outer instances become reachable and not eligible for garbage collection.
    }
}