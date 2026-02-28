import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {}

  static void bar() {
    foo(null);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {}

  static void bar2() {
    foo2(null);
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