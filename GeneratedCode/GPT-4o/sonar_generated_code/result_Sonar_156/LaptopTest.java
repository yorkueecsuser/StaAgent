import org.junit.Test;

public class StoreTest {

    @Test
    public void testShowBug() {
        Store store = new Store();
        store.showBug(); // TRIGGER BUG: Classes should not be compared by name
    }
}