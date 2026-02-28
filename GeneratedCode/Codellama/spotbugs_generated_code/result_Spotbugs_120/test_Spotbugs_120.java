import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleCastTest {
    @Test
    public void testImpossibleCast() {
        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 1234;
        objects[2] = new Object();

        // TRIGGER BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        String str = (String) objects[1];
        System.out.println(str);
    }
}