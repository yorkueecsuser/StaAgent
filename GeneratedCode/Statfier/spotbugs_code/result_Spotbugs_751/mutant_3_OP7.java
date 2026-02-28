import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.reflect.Field;

class ReflectionIncreaseAccessibilityTest {
  ReflectionIncreaseAccessibilityTest() {}

  @ExpectWarning("REFLC")
  public static <T> T create(Class<T> c) throws InstantiationException, IllegalAccessException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return c.newInstance();
  }

  private int field;

  @ExpectWarning("REFLF")
  public void setField(String fieldName, int value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    try {
      Field f = this.getClass().getDeclaredField(fieldName);
      f.setInt(this, value);
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  @ExpectWarning("REFLF")
  public Field getAccessibleField(String fieldName) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    try {
      Field f = this.getClass().getDeclaredField(fieldName);
      f.setAccessible(true);
      return f;
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
      return null;
    } catch (SecurityException e) {
      e.printStackTrace();
      return null;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}