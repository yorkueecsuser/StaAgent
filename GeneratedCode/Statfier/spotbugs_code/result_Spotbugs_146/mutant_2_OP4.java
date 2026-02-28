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

      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will execute if shouldRun is true
        System.out.println("This is reachable code.");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This is unreachable code.");
      }

      return c;
    } catch (Exception e) {
      throw new CloneNotSupportedException();
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}