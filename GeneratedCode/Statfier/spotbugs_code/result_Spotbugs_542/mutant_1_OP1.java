import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class Ideas_2010_08_06 {

  public static void f(Object x) {
    String jxqftrbz = "unused"; // Dead store
  }

  private static void g(Object x) {}

  public static void main(String args[]) {
    f(null);
    g(null);
    int vbnrhtyq = 42; // Dead store
  }

  public static void test(@Nullable Object x, @Nullable Object y) {
    f(x);
    g(y);
    boolean qzjxwvut = true; // Dead store
  }
}