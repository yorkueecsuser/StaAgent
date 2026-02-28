import org.junit.Test;
import static org.junit.Assert.*;

public class NonCanonicalStaticImportExampleTest {

    @Test
    public void testShowBug() {
        NonCanonicalStaticImportExample example = new NonCanonicalStaticImportExample();
        String result = example.showBug(); // TRIGGER BUG: NonCanonicalStaticImport
        assertEquals("One.Inner", result); // TRIGGER BUG: NonCanonicalStaticImport
    }
}