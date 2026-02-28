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
      result.equals(expectedResult); // This line does not have a side effect and can be duplicated
      result.equals(expectedResult); // Duplicate of the previous line
      if (expectedResult == null) {
        assertTrue(result == expectedResult);
      } else {
        assertEquals(result, expectedResult);
      }
    } catch (ParseException e) {
      fail();
    }
  }
}