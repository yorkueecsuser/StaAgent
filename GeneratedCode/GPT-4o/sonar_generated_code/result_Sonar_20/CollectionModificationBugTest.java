import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class CollectionModificationBugTest {

    @Test
    public void testShowBug() {
        CollectionModificationBug cmb = new CollectionModificationBug();
        List<String> items = new ArrayList<>();
        items.add("apple");
        items.add("xenon");
        items.add("xylophone");
        items.add("banana");

        cmb.showBug(items); // TRIGGER BUG: Collections should not be modified while they are iterated
    }

    @Test
    public void testShowBugWithDifferentData() {
        CollectionModificationBug cmb = new CollectionModificationBug();
        List<String> items = new ArrayList<>();
        items.add("xray");
        items.add("xylophone");
        items.add("xerox");

        cmb.showBug(items); // TRIGGER BUG: Collections should not be modified while they are iterated
    }
}