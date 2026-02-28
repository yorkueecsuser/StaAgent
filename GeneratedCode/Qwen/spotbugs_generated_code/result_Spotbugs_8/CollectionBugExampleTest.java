import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionBugExampleTest {

    @Test
    public void testShowBug() {
        CollectionBugExample example = new CollectionBugExample();
        example.showBug(); // TRIGGER BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
    }
}