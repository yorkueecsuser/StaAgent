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

      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        System.out.println("This is an unreachable block.");
      } else {
        // This block will always execute
        System.out.println("This block will always execute.");
      }

      return c;
    } catch (Exception e) {
      throw new CloneNotSupportedException();
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-block unreachable
  }
}