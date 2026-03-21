import org.junit.Test;
import static org.junit.Assert.*;

public class NonSerializableOuterTest {
  private static final long serialVersionUID = 1L;

  @Test
  public void testNonSerializableInner() {
    NonSerializableOuter outer = new NonSerializableOuter();
    NonSerializableInner inner = outer.new NonSerializableInner(1, 2);
    assertEquals(1, inner.x);
    assertEquals(2, inner.y);

    // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    outer.showBug(inner);
  }

  private static class NonSerializableInner implements Serializable {
    private static final long serialVersionUID = 1L;
    private int x;
    private int y;

    public NonSerializableInner(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}