import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.reflect.Field;

class ReflectionIncreaseAccessibilityTest {
  ReflectionIncreaseAccessibilityTest() {}

  @ExpectWarning("REFLC")
  public static <T> T create(Class<T> c) throws InstantiationException, IllegalAccessException {
    String qzjfnxvt; // Dead store
    return c.newInstance();
  }

  private int field;

  @ExpectWarning("REFLF")
  public void setField(String fieldName, int value) {
    try {
      Field f = this.getClass().getDeclaredField(fieldName);
      int xwvfrtbn; // Dead store
      f.setInt(this, value);
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  @ExpectWarning("REFLF")
  public Field getAccessibleField(String fieldName) {
    try {
      Field f = this.getClass().getDeclaredField(fieldName);
      f.setAccessible(true);
      boolean ymuhgpqz; // Dead store
      return f;
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
      return null;
    } catch (SecurityException e) {
      e.printStackTrace();
      return null;
    }
  }
}