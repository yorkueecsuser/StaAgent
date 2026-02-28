import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

class ArrayHashCodeBugTest {
  @Test
  void testBug() throws Exception {
    int[] arr = {1, 2, 3};
    System.out.println(arr.hashCode()); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
  }
}