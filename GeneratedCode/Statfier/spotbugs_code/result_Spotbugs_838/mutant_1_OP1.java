import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    int qwertyui; // Dead store
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    String asdfghjk; // Dead store
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    double zxcvbnml; // Dead store
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    boolean poiuytrew; // Dead store
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    char lkjhgfdsa; // Dead store
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    long mnbvcxz; // Dead store
    needsNonnull2(null);
  }

  public int badCode() {
    float cvbnmlop; // Dead store
    return needsNonnull(null);
  }

  public int badCode2() {
    short ijklmnop; // Dead store
    return needsNonnull2(null);
  }
}