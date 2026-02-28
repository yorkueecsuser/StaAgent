import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {}

  static void bar() {
    foo(null);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case will always be executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {}

  static void bar2() {
    foo2(null);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case will always be executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}