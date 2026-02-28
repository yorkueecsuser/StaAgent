import org.junit.Test;
import static org.junit.Assert.*;

public class UnhashableClassExampleTest {

    @Test
    public void showBugTest() {
        UnhashableClassExample example = new UnhashableClassExample(null);
        example.showBug();
        // TRIGGER BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
    }
}