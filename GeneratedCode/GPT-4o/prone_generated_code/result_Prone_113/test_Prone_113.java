import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionModificationExampleTest {

    @Test
    public void testShowBug() {
        CollectionModificationExample example = new CollectionModificationExample();
        Collection<String> inputCollection = new ArrayList<>();
        inputCollection.add("test");

        Collection<String> result = example.showBug(inputCollection); // TRIGGER BUG: ModifyingCollectionWithItself

        assertNotEquals("The collection should not be equal after modification", inputCollection, result); // TRIGGER BUG: ModifyingCollectionWithItself
    }
}