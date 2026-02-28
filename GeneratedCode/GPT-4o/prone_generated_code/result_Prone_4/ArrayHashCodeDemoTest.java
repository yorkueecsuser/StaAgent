import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayHashCodeDemoTest {

    @Test
    public void testShowBug() {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray1 = {1, 2, 3};
        int[] intArray2 = {1, 2, 3};

        int hashCode1 = demo.showBug(intArray1); // TRIGGER BUG: ArrayHashCode
        int hashCode2 = demo.showBug(intArray2); // TRIGGER BUG: ArrayHashCode

        // The test will fail because the bug causes the hash code to be based on array identity
        assertEquals("Hash codes should be equal for same content arrays", hashCode1, hashCode2);
    }
}