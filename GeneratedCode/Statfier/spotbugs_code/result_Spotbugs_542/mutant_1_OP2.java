import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class Ideas_2010_08_06 {

  public static void f(Object x) {}

  private static void g(Object x) {}

  public static void main(String args[]) {
    f(null);
    g(null);
  }

  public static void test(@Nullable Object x, @Nullable Object y) {
    f(x);
    f(x); // Duplicated method call
    g(y);
    g(y); // Duplicated method call
  }
}