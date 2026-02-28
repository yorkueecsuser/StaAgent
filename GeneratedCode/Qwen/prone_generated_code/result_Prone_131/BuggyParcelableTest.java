import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyParcelableTest {

    @Test
    public void testMissingCREATOR() {
        BuggyParcelable buggyObject = new BuggyParcelable(1, "Example");
        assertEquals("This class is missing the CREATOR field required for Parcelable implementation.", buggyObject.showBug()); // TRIGGER BUG: ParcelableCreator
    }
}