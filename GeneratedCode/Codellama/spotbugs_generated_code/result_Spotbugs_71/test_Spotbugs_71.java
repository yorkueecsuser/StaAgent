import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class PrimitiveArrayPassedToObjectVarArgTest {
    @Test
    public void testBug() {
        int[] arr = {1, 2, 3};
        assertEquals("[1, 2, 3]", Arrays.toString(arr));
        printArray(arr); // TRIGGER BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static void printArray(Object... args) {
        System.out.println(Arrays.toString(args));
    }
}