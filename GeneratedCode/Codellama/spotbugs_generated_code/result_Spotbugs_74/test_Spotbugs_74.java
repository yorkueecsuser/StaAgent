import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayEqualsBugTest {
  
  @Test
  public void testArrayEqualsBug() {
    String[] arr1 = {"hello", "world"};
    String[] arr2 = {"hello", "world"};
    ArrayEqualsBug bug = new ArrayEqualsBug();
    bug.showBug(arr1, arr2);
  }
}