import org.junit.Test;
import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testHasSellByDate() {
        Store store = new Store();
        Fruit fruit = new Fruit(); // A Fruit object does not have a sell-by date
        assertTrue(store.showBug(fruit)); // TRIGGER BUG: Classes should not be compared by name
    }
}