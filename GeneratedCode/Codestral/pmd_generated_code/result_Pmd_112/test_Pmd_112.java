import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantFieldInitializerBugTest {
    @Test
    public void testBugTrigger() {
        RedundantFieldInitializerBug buggy = new RedundantFieldInitializerBug();
        buggy.showBug();

        // TRIGGER BUG: RedundantFieldInitializer
        assertTrue("b field was not initialized to false", buggy.b == false);
        assertTrue("by field was not initialized to 0", buggy.by == 0);
        assertTrue("s field was not initialized to 0", buggy.s == 0);
        assertTrue("c field was not initialized to 0", buggy.c == 0);
        assertTrue("i field was not initialized to 0", buggy.i == 0);
        assertTrue("l field was not initialized to 0", buggy.l == 0);
        assertTrue("f field was not initialized to 0.0f", buggy.f == 0.0f);
        assertTrue("d field was not initialized to 0.0d", buggy.d == 0.0d);
        assertTrue("o field was not initialized to null", buggy.o == null);
        assertTrue("mca field was not initialized to null", buggy.mca == null);
        assertTrue("i1 field was not initialized to 0", buggy.i1 == 0);
        assertTrue("ia1 field was not initialized to null", buggy.ia1 == null);
        assertTrue("Nested b field was not initialized to false", buggy.new Nested().b == false);
    }
}