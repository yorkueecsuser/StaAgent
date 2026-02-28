import org.junit.Test;
import static org.junit.Assert.*;

public class SelfContainingCollectionExampleTest {

    @Test
    public void testShowBug() {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug(); // TRIGGER BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        assertFalse("The set should not contain itself.", result); // This assertion will fail because the set contains itself
    }
}