import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.reflect.Field;

class ReflectionIncreaseAccessibilityTest {
  ReflectionIncreaseAccessibilityTest() {}

  @ExpectWarning("REFLC")
  public static <T> T create(Class<T> c) throws InstantiationException, IllegalAccessException {
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder for any additional logic if needed
    } else {
      // Unreachable else branch
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
    if (condition) {
      // This is a placeholder for any additional logic if needed
    } else {
      // Unreachable else branch
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
    if (condition) {
      // This is a placeholder for any additional logic if needed
    } else {
      // Unreachable else branch
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the else branch is unreachable
  }
}