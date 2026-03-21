import org.junit.Test;
import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testShowBugWithSellByDate() {
        Store store = new Store();
        Pear1 pear1 = new Pear1();
        Pear2 pear2 = new Pear2();

        // This should return false, but due to class name comparison bug, it returns true
        assertFalse(store.showBug(pear1, null)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testShowBugWithIsList() {
        Store store = new Store();

        // This should return false, but due to class name comparison bug, it returns true
        assertFalse(store.showBug(null, java.util.ArrayList.class)); // TRIGGER BUG: Classes should not be compared by name
    }
}