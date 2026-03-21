import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class UnhashableClassTest {
    UnhashableClass unhashableClass = new UnhashableClass();

    @Test
    public void testShowBug() {
        unhashableClass.showBug(); // TRIGGER BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
    }
}