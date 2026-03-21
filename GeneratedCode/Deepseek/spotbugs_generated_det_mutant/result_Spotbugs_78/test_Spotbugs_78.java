import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testBug() {
        Main m = new Main();
        m.showBug();
        // TRIGGER BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        assertEquals(10, m.foo);
    }
}