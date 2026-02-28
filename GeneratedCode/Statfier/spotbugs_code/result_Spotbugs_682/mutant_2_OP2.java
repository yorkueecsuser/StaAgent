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
      result.equals(expectedResult); // This line does not have an assignment statement, so we look for the next one.
      if (expectedResult == null) {
        assertTrue(result == expectedResult);
        assertTrue(result == expectedResult); // Duplicate of the previous assignment-like statement
      } else {
        assertEquals(result, expectedResult);
        assertEquals(result, expectedResult); // Duplicate of the previous assignment-like statement
      }
    } catch (ParseException e) {
      fail();
    }
  }
}