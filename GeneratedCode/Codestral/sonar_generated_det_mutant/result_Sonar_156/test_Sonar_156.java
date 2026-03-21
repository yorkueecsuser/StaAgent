import org.junit.Test;
import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testHasSellByDate() {
        Store store = new Store();
        Object badPear = new Pear(); // Using the same class named Pear from the same package
        assertTrue("Test failed: The method should return true for a Pear object", store.hasSellByDate(badPear)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void testIsList() {
        Store store = new Store();
        Class<?> badListClass = java.util.ArrayList.class; // Using the same List implementation
        assertTrue("Test failed: The method should return true for an ArrayList class", store.isList(badListClass)); // TRIGGER BUG: Classes should not be compared by name
    }

    @Test
    public void showBug() {
        Store store = new Store();
        store.showBug();
    }
}