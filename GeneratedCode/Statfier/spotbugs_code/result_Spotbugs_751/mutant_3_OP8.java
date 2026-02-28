import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.lang.reflect.Field;

class ReflectionIncreaseAccessibilityTest {
  ReflectionIncreaseAccessibilityTest() {}

  @ExpectWarning("REFLC")
  public static <T> T create(Class<T> c) throws InstantiationException, IllegalAccessException {
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
  }

  // Mutated code starts here

  @ExpectWarning("REFLC")
  public static <T> T create(Class<T> x) throws InstantiationException, IllegalAccessException {
    return x.newInstance();
  }

  private int g;

  @ExpectWarning("REFLF")
  public void setField(String y, int z) {
    try {
      Field q = this.getClass().getDeclaredField(y);
      q.setInt(this, z);
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  @ExpectWarning("REFLF")
  public Field getAccessibleField(String w) {
    try {
      Field v = this.getClass().getDeclaredField(w);
      v.setAccessible(true);
      return v;
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
      return null;
    } catch (SecurityException e) {
      e.printStackTrace();
      return null;
    }
  }
}