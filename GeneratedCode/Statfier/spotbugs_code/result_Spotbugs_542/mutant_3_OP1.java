import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class Ideas_2010_08_06 {

  public static void f(Object x) {}

  private static void g(Object x) {}

  public static void main(String args[]) {
    f(null);
    g(null);
    String qjvbnrht = "unused"; // Dead Store
  }

  public static void test(@Nullable Object x, @Nullable Object y) {
    f(x);
    g(y);
    int kxwvzptn = 42; // Dead Store
  }
}