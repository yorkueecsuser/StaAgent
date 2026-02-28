import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BuggyCollectionTest {

    @Test
    public void testShowBug() {
        BuggyCollection buggyCollection = new BuggyCollection();
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);

        // TRIGGER BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        List<Integer> resultList = buggyCollection.showBug(inputList);

        assertEquals(inputList, resultList);
    }
}