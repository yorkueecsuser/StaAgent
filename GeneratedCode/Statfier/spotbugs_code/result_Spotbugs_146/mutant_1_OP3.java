import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

class ShouldDoInDoPriviledged implements Cloneable {

  static AtomicInteger id = new AtomicInteger();

  final int x = id.getAndIncrement();

  @Override
  public ShouldDoInDoPriviledged clone() throws CloneNotSupportedException {
    try {
      ShouldDoInDoPriviledged c = (ShouldDoInDoPriviledged) super.clone();
      Field xField = ShouldDoInDoPriviledged.class.getField("x");
      xField.setAccessible(true);
      xField.setInt(c, id.getAndIncrement());

      // Introduced unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable statement.");
      }

      return c;
    } catch (Exception e) {
      throw new CloneNotSupportedException();
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}