import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.reflect.Field;

class ReflectionIncreaseAccessibilityTest {
  ReflectionIncreaseAccessibilityTest() {}

  @ExpectWarning("REFLC")
  public static <T> T create(Class<T> c) throws InstantiationException, IllegalAccessException {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable based on the condition
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
    return c.newInstance();
  }

  private int field;

  @ExpectWarning("REFLF")
  public void setField(String fieldName, int value) {
    try {
      Field f = this.getClass().getDeclaredField(fieldName);
      f.setInt(this, value);
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable based on the condition
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
  }

  @ExpectWarning("REFLF")
  public Field getAccessibleField(String fieldName) {
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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable based on the condition
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns true, ensuring the switch case is never false
    return true;
  }
}