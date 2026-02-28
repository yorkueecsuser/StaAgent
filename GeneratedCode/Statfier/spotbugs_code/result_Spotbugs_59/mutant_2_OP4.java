import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else block
    }
  }

  static void bar() {
    foo(null);
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {
    boolean shouldRun2 = getCondition();
    if (shouldRun2) {
      // Some code that should run if shouldRun2 is true
    } else {
      // Unreachable else block
    }
  }

  static void bar2() {
    foo2(null);
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the else block is unreachable
  }
}