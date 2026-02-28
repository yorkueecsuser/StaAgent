import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in foo.");
    }
  }

  static void bar() {
    foo(null);
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in foo2.");
    }
  }

  static void bar2() {
    foo2(null);
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}