import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;

public class UnhashableExampleTest {

    @Test
    public void testShowBug() {
        UnhashableExample example = new UnhashableExample();
        UnhashableExample.Unhashable[] elements = {
            new UnhashableExample.Unhashable("test1"),
            new UnhashableExample.Unhashable("test2"),
            new UnhashableExample.Unhashable("test1")
        };
        Set<UnhashableExample.Unhashable> result = example.showBug(elements);
        // TRIGGER BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
        assertEquals("Set size should be 2 due to duplicate 'test1'", 2, result.size());
    }
}