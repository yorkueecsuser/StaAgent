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
      
      // Inserting an unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will never return true
        assertTrue(false);
      }
    } catch (ParseException e) {
      fail();
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}