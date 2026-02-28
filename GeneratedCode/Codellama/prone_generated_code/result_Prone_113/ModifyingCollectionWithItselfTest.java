import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ModifyingCollectionWithItselfTest {
    @Test
    public void testShowBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // TRIGGER BUG: ModifyingCollectionWithItself
        list.addAll(list);

        assertEquals("The collection should contain duplicates", 6, list.size());
    }
}