import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    String qzjxmtkp; // Dead store
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    int vbnrhtyx; // Dead store
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    double wqejfzxc; // Dead store
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    boolean rtymnqpo; // Dead store
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    char klmnopqr; // Dead store
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    float stuvwxyz; // Dead store
    needsNonnull2(null);
  }

  public int badCode() {
    long abcdefgh; // Dead store
    return needsNonnull(null);
  }

  public int badCode2() {
    short ijklmnop; // Dead store
    return needsNonnull2(null);
  }
}