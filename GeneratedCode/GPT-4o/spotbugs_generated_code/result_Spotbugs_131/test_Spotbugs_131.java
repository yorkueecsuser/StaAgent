import org.junit.Test;
import static org.junit.Assert.*;

public class HashCodeDemoTest {

    @Test
    public void testShowBug() {
        HashCodeDemo demo = new HashCodeDemo();
        int[] numbers = {1, 2, 3, 4, 5};
        int hashCodeValue1 = demo.showBug(numbers); // TRIGGER BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        
        // Modify the array to trigger bug by showing that the hashCode does not depend on content
        numbers[0] = 9;
        int hashCodeValue2 = demo.showBug(numbers); // TRIGGER BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
        
        assertEquals(hashCodeValue1, hashCodeValue2); // This assertion will fail if the bug is triggered
    }
}