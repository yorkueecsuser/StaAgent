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

      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        System.out.println("This is an unreachable block.");
      } else {
        // This block will also never execute for the same reason
        System.out.println("This is another unreachable block.");
      }

      return c;
    } catch (Exception e) {
      throw new CloneNotSupportedException();
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else branches are unreachable
    return false;
  }
}