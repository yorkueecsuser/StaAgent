import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsUnrelatedTypesTest {

    @Test
    public void testShowBug() {
        EqualsUnrelatedTypes equalsUnrelatedTypes = new EqualsUnrelatedTypes();
        EqualsUnrelatedTypes.Animal animal = new EqualsUnrelatedTypes.Animal("Lion");
        EqualsUnrelatedTypes.Plant plant = new EqualsUnrelatedTypes.Plant("Rose");
        
        boolean result = equalsUnrelatedTypes.showBug(animal, plant); // TRIGGER BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        assertTrue("The showBug method should return true, but it failed due to comparing unrelated types.", result);
    }
}