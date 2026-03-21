import org.junit.Test;
import static org.junit.Assert.*;

public class UnresolvableReferenceExample {

    public void showBug() {
        // Attempting to create an instance of a class that does not exist
        NonExistentClass obj = new NonExistentClass(); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    }
}

public class UnresolvableReferenceExampleTest {

    @Test
    public void testShowBug() {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug(); // TRIGGER BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
    }
}