import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    String qvbnrhty = "unused"; // Dead store mutation
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    int jklmnpqr = 42; // Dead store mutation
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    boolean abcdefgh = true; // Dead store mutation
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    double ijklmnop = 3.14; // Dead store mutation
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    char qrstuvwx = 'x'; // Dead store mutation
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    long yzabcdef = 987654321; // Dead store mutation
    needsNonnull2(null);
  }

  public int badCode() {
    float ghijklmn = 2.71f; // Dead store mutation
    return needsNonnull(null);
  }

  public int badCode2() {
    short opqrstuv = 123; // Dead store mutation
    return needsNonnull2(null);
  }
}