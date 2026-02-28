import org.junit.Test;
import static org.junit.Assert.*;

public class InexactVarargsConditionalTest {
    @Test
    public void testBug() {
        int[] arr = new int[] {1, 2};
        boolean flag = true;
        showBug(flag? arr : 3); // TRIGGER BUG: InexactVarargsConditional
    }

    public void showBug(Object... args) {
        System.out.println(Arrays.deepToString(args));
    }
}