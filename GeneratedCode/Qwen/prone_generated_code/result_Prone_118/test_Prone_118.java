import org.junit.Test;
import static org.junit.Assert.*;

class One {
    static class Inner {
        static int getValue() {
            return 42;
        }
    }
}

class Two extends One {}

class NonCanonicalStaticImportExample {

    // Intentionally using non-canonical static import to demonstrate the bug
    import static Two.Inner.getValue; // TRIGGER BUG: NonCanonicalStaticImport

    public int showBug() {
        return getValue();
    }

    public static void main(String[] args) {
        NonCanonicalStaticImportExample example = new NonCanonicalStaticImportExample();
        System.out.println(example.showBug());
    }
}

public class NonCanonicalStaticImportExampleTest {

    @Test
    public void testShowBug() {
        NonCanonicalStaticImportExample example = new NonCanonicalStaticImportExample();
        assertEquals(42, example.showBug()); // TRIGGER BUG: NonCanonicalStaticImport
    }
}