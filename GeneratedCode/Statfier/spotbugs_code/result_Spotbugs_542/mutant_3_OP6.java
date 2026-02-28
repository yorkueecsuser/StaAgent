import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class Ideas_2010_08_06 {

  public static void f(Object x) {}

  private static void g(Object x) {}

  public static void main(String args[]) {
    f(null);
    g(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  public static void test(@Nullable Object x, @Nullable Object y) {
    f(x);
    g(y);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private static boolean getCondition() {
    return false;
  }
}