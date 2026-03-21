import org.junit.Test;
import static org.junit.Assert.*;

public class StoreTest {
    @Test
    public void testHasSellByDate() {
        Store store = new Store();
        // TRIGGER BUG: Classes should not be compared by name
        assertFalse(store.hasSellByDate(new Pear()));
    }

    @Test
    public void testIsList() {
        Store store = new Store();
        // TRIGGER BUG: Classes should not be compared by name
        assertFalse(store.isList(Pear.class));
    }
}