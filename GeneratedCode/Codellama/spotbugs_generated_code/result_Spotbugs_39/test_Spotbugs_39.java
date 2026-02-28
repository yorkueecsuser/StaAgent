import org.junit.Test;
import static org.junit.Assert.*;

public class BadEqualTest {
    @Test
    public void testEquals() {
        BadEqual be = new BadEqual();
        assertEquals(be, be);
    }

    @Test
    public void testNotEquals() {
        BadEqual be1 = new BadEqual();
        BadEqual be2 = new BadEqual();
        assertNotEquals(be1, be2);
    }

    @Test
    public void testNull() {
        BadEqual be = new BadEqual();
        assertNotNull(be);
    }
}