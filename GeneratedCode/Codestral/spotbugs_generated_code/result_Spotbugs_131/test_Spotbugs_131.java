import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayHashCodeTest {

    @Test
    public void testShowBug() {
        ArrayHashCode ah = new ArrayHashCode();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // TRIGGER BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        assertNotEquals(ah.showBug(array1), ah.showBug(array2));
    }
}