import org.junit.Test;
import static org.junit.Assert.*;

public class StoreTest {
    @Test
    public void testHasSellByDate() {
        Store store = new Store();
        Fruit fruit = new Pear();
        assertTrue(store.hasSellByDate(fruit)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testIsList() {
        Store store = new Store();
        Class<T> valueClass = new List<T>();
        assertTrue(store.isList(valueClass)); // TRIGGER BUG: Classes should not be compared by name
    }
}