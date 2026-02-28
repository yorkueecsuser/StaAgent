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
      return c;
    } catch (Exception e) {
      throw new CloneNotSupportedException();
    }
  }

  // Mutated code
  final int y = id.getAndIncrement();

  @Override
  public ShouldDoInDoPriviledged clone() throws CloneNotSupportedException {
    try {
      ShouldDoInDoPriviledged b = (ShouldDoInDoPriviledged) super.clone();
      Field yField = ShouldDoInDoPriviledged.class.getField("y");
      yField.setAccessible(true);
      yField.setInt(b, id.getAndIncrement());
      return b;
    } catch (Exception e) {
      throw new CloneNotSupportedException();
    }
  }
}