import com.google.common.base.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class TestNullable {
  static void foo(@Nullable Object o) {}

  static void bar() {
    foo(null);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
      default:
        // Default case
        break;
    }
  }

  static void foo2(@edu.umd.cs.findbugs.annotations.CheckForNull Object o) {}

  static void bar2() {
    foo2(null);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is also unreachable");
        break;
      default:
        // Default case
        break;
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}