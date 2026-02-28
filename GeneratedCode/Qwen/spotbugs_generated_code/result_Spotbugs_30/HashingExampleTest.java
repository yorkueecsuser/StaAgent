import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;

public class HashingExampleTest {

    @Test
    public void testShowBug() {
        HashingExample example = new HashingExample();
        Set<HashingExample.UnhashableObject> result = example.showBug(); // TRIGGER BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS) 
        assertEquals(1, result.size()); // This assertion will fail because the set should contain only one element due to the unhashable nature of UnhashableObject
    }
}