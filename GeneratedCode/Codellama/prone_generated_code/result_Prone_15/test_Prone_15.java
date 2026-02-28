import org.junit.Test;
import static org.junit.Assert.*;

public class BundleDeserializationCastTest {
  @Test
  public void testBug() {
    // TRIGGER BUG: BundleDeserializationCast
    Bundle bundle = new Bundle();
    bundle.putSerializable("key", new Date());
    Date date = (Date) bundle.getSerializable("key");
    assertEquals(date, new Date());
  }
}

{
  "Trigger_Explanation": "The test case triggers the bug by creating a Bundle object, adding a Date object to it with the key \"key\", and then retrieving the Date object from the Bundle object using the same key. The bug occurs when the Date object is flattened to its base type, which causes the assertEquals() method to fail.",
  "Trigger_Line": [10, 11]
}