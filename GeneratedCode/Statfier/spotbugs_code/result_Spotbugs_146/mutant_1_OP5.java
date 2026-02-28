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

      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("This is an unreachable case.");
          break;
        default:
          // Default case to avoid compiler warning
          break;
      }

      return c;
    } catch (Exception e) {
      throw new CloneNotSupportedException();
    }
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement unreachable
    return false;
  }
}