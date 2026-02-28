import org.junit.Test;
import static org.junit.Assert.*;

public class StoreTest {
  
  // Compliant code
  private Store compliantStore = new Store();

  @Test
  public void testHasSellByDate() {
    Object item = new food.Pear();
    assertTrue(compliantStore.hasSellByDate(item)); // Line 12
  }

  @Test
  public void testIsList() {
    Class<?> valueClass = List.class;
    assertTrue(compliantStore.isList(valueClass));  // Line 24
  }
}