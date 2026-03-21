import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        int[] array = {1, 2, 3, 4, 5};
        Main.main(null);
        int[] buffer = Main.showBug();
        buffer[0] = 10; // TRIGGER BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)

        int[] expected = {10, 2, 3, 4, 5};
        assertArrayEquals(expected, Main.showBug());
    }
}