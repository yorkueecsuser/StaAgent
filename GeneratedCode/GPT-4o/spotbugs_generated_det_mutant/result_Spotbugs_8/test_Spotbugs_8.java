import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionSelfAdditionTest {

    @Test
    public void testShowBug() {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug(); // TRIGGER BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
    }
}