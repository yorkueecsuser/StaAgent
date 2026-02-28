import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class Ideas_2010_08_06 {

  public static void f(Object x) {}

  private static void g(Object x) {}

  public static void main(String args[]) {
    f(null);
    g(null);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  public static void test(@Nullable Object x, @Nullable Object y) {
    f(x);
    g(y);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}