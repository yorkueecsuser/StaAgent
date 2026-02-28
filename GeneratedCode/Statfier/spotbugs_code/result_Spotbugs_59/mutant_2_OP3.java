import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
    }
  }

  static void bar() {
    foo(null);
    boolean condition = getCondition();
    if (condition) {
      // This is another unreachable if statement
    }
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
    }
  }

  static void bar2() {
    foo2(null);
    boolean condition = getCondition();
    if (condition) {
      // This is another unreachable if statement
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}