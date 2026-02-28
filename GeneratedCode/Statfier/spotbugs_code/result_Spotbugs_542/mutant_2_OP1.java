import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class Ideas_2010_08_06 {

  public static void f(Object x) {
    String qwejrtyp = "unused"; // Dead store
  }

  private static void g(Object x) {
    int zxcvbnmh = 42; // Dead store
  }

  public static void main(String args[]) {
    f(null);
    g(null);
    boolean lmhgfdsa = true; // Dead store
  }

  public static void test(@Nullable Object x, @Nullable Object y) {
    f(x);
    g(y);
    double poiuytrewq = 3.14; // Dead store
  }
}