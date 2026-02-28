import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class Ideas_2010_08_06 {

  public static void f(Object x) {}

  private static void g(Object x) {}

  public static void main(String args[]) {
    f(null);
    f(null); // Duplicate of f(null);
    g(null);
    g(null); // Duplicate of g(null);
  }

  public static void test(@Nullable Object x, @Nullable Object y) {
    f(x);
    f(x); // Duplicate of f(x);
    g(y);
    g(y); // Duplicate of g(y);
  }
}