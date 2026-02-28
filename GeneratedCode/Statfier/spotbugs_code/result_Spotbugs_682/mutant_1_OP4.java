import java.text.Format;
import java.text.ParseException;

public abstract class SecondKaboom {
  abstract void fail();

  abstract void assertTrue(boolean b);

  abstract void assertEquals(Object o1, Object o2);

  protected void parseHelperSuccess(Format f, String parseString, Object expectedResult) {
    Object result;
    // First check the parseObject(String) method.
    try {
      result = f.parseObject(parseString);
      result.equals(expectedResult);
      if (expectedResult == null) {
        assertTrue(result == expectedResult);
      } else {
        assertEquals(result, expectedResult);
      }
      
      // Inserting unreachable if-else branch
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() returns false
        assertTrue(false);
      } else {
        // This block will always execute
        assertTrue(true);
      }
    } catch (ParseException e) {
      fail();
    }
  }

  private boolean getCondition() {
    return false;
  }
}